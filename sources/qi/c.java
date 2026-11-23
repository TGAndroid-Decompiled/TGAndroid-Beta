package qi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.ui.ActionBar.m6;
public final class c extends CharacterStyle {
    public final int f56184a;

    public c(int i7) {
        this.f56184a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        HashMap hashMap = q.f56220b;
        int i10 = this.f56184a & 255;
        switch (i10) {
            case 8:
            case 18:
                i10 = 1;
                break;
            case 9:
            case 10:
            case 14:
            case 15:
                i10 = 3;
                break;
            case 11:
            case 13:
                i10 = 7;
                break;
            case 12:
            case 16:
            case 17:
            case 19:
                i10 = 4;
                break;
            case 20:
                i10 = 6;
                break;
            case 21:
                i10 = 2;
                break;
        }
        switch (i10) {
            case 1:
                i7 = m6.zl;
                break;
            case 2:
                i7 = m6.Al;
                break;
            case 3:
                i7 = m6.Bl;
                break;
            case 4:
                i7 = m6.Cl;
                break;
            case 5:
                i7 = m6.Dl;
                break;
            case 6:
                i7 = m6.El;
                break;
            case 7:
                i7 = m6.Fl;
                break;
            default:
                i7 = -1;
                break;
        }
        if (i7 >= 0) {
            textPaint.setColor(m6.x0(null, i7, false));
        }
    }
}
