package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wh implements Runnable {
    public final int f45006a;
    public final wn f45007b;

    public wh(wn wnVar, int i10) {
        this.f45006a = i10;
        this.f45007b = wnVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45006a;
        wn wnVar = this.f45007b;
        switch (i10) {
            case 0:
                FrameLayout.LayoutParams i11 = org.telegram.ui.Components.kb1.i(-1, -2, 87);
                i11.bottomMargin = wnVar.Y.getMeasuredHeight();
                wnVar.f45163j1.addView(wnVar.K1, i11);
                wnVar.K1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                wnVar.K1.m(0.0f, wnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                wnVar.K1.u();
                return;
            case 1:
                int i12 = wn.f45035fd;
                wnVar.i7();
                return;
            case 2:
                int i13 = wn.f45035fd;
                wnVar.i7();
                return;
            case 3:
                wn.m2(wnVar);
                return;
            case 4:
                wn.m2(wnVar);
                return;
            case 5:
                int i14 = wn.f45035fd;
                wnVar.Ya();
                return;
            case 6:
                int i15 = wn.f45035fd;
                wnVar.Ya();
                return;
            case 7:
                int i16 = wn.f45035fd;
                wnVar.Ya();
                return;
            case 8:
                int i17 = wn.f45035fd;
                wnVar.Ya();
                return;
            case 9:
                int i18 = wn.f45035fd;
                wnVar.Ya();
                return;
            case 10:
                int i19 = wn.f45035fd;
                wnVar.Ya();
                return;
            case 11:
                int i20 = wn.f45035fd;
                wnVar.Ya();
                return;
            default:
                int i21 = wn.f45035fd;
                wnVar.Ya();
                return;
        }
    }
}
