
package uz.turgunboyevjurabek.simplecalendar.Data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.YearMonth

/**
 * Created by meyta.taliti on 20/05/23.
 */
data class CalendarUiState(
    val yearMonth: YearMonth,
    val dates: List<Date>
) {
    companion object {
        @RequiresApi(Build.VERSION_CODES.O)
        val Init = CalendarUiState(
            yearMonth = YearMonth.now(),
            dates = emptyList()
        )
    }
    data class Date(
        val dayOfMonth: String,
        val isSelected: Boolean
    ) {
        companion object {
            val Empty = Date("", false)
        }
    }
}
