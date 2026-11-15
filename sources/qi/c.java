package qi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.ui.ActionBar.j6;
public final class c extends CharacterStyle {
    public final int f55600a;

    public c(int i7) {
        this.f55600a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        HashMap hashMap = q.f55636b;
        int i10 = this.f55600a & 255;
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
                i7 = j6.zl;
                break;
            case 2:
                i7 = j6.Al;
                break;
            case 3:
                i7 = j6.Bl;
                break;
            case 4:
                i7 = j6.Cl;
                break;
            case 5:
                i7 = j6.Dl;
                break;
            case 6:
                i7 = j6.El;
                break;
            case 7:
                i7 = j6.Fl;
                break;
            default:
                i7 = -1;
                break;
        }
        if (i7 >= 0) {
            textPaint.setColor(j6.x0(null, i7, false));
        }
    }
}
