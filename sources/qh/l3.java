package qh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class l3 {
    public final a f46499a;
    public final int f46500b;
    public final o3 f46501c;

    public l3(o3 o3Var, a aVar, int i9) {
        this.f46501c = o3Var;
        this.f46499a = aVar;
        this.f46500b = i9;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && b4.c(inlineButtonType) && (d = d()) != null) {
            int i9 = this.f46500b;
            if (i9 >= 0 && i9 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                o3 o3Var = this.f46501c;
                b2 b2Var = o3Var.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i9);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = u5.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                o3Var.U2.N(false);
                b2 b2Var2 = o3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                o3Var.f46565d3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i9;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i9 = this.f46500b) >= 0 && i9 < d.buttons.size()) {
            o3 o3Var = this.f46501c;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            d.buttons.remove(i9);
            o3Var.U2.N(false);
            b2 b2Var2 = o3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            o3Var.f46565d3.onContentChanged();
        }
    }

    public final boolean c() {
        int i9;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i9 = this.f46500b) >= 0 && i9 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f46499a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
