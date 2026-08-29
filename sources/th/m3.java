package th;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class m3 {
    public final a f48569a;
    public final int f48570b;
    public final p3 f48571c;

    public m3(p3 p3Var, a aVar, int i10) {
        this.f48571c = p3Var;
        this.f48569a = aVar;
        this.f48570b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && c4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f48570b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                p3 p3Var = this.f48571c;
                b2 b2Var = p3Var.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = v5.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                p3Var.U2.N(false);
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.f48638d3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f48570b) >= 0 && i10 < d.buttons.size()) {
            p3 p3Var = this.f48571c;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            d.buttons.remove(i10);
            p3Var.U2.N(false);
            b2 b2Var2 = p3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            p3Var.f48638d3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f48570b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f48569a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
