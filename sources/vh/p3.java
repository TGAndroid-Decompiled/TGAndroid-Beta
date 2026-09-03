package vh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class p3 {
    public final a f46136a;
    public final int f46137b;
    public final s3 f46138c;

    public p3(s3 s3Var, a aVar, int i10) {
        this.f46138c = s3Var;
        this.f46136a = aVar;
        this.f46137b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z4;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && f4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f46137b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || d.buttons.size() < 8) {
                s3 s3Var = this.f46138c;
                d2 d2Var = s3Var.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                if (z4) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = y5.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z4) {
                    d.buttons.add(pageButton);
                }
                s3Var.V2.N(false);
                d2 d2Var2 = s3Var.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                s3Var.f46209e3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f46137b) >= 0 && i10 < d.buttons.size()) {
            s3 s3Var = this.f46138c;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            d.buttons.remove(i10);
            s3Var.V2.N(false);
            d2 d2Var2 = s3Var.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            s3Var.f46209e3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f46137b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f46136a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
