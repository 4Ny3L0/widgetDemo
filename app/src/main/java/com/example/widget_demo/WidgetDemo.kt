import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.example.widget_demo.R

// Implementation of App Widget functionality.
class NewAppWidget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    // Enter relevant functionality for
    // when the first widget is created
    override fun onEnabled(context: Context) {

    }

    // Enter relevant functionality for
    // when the last widget is disabled
    override fun onDisabled(context: Context) {

    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    val widgetText = context.getString(R.string.app_name)
    // Construct the RemoteViews object
    val views = RemoteViews(context.packageName, R.layout.widget_layout)
    //views.setTextViewText(R.id.send_yappy_btn, widgetText)
    /*views.setTextViewText(R.id.pay_yappy_btn, widgetText)
    views.setTextViewText(R.id.qr_yappy_btn, widgetText)
    views.setTextViewText(R.id.pendings_yappy_btn, widgetText)*/


    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}