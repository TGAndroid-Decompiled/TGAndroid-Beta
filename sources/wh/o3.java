package wh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class o3 {
    public final a f49935a;
    public final int f49936b;
    public final r3 f49937c;

    public o3(r3 r3Var, a aVar, int i10) {
        this.f49937c = r3Var;
        this.f49935a = aVar;
        this.f49936b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z4;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && e4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f49936b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || d.buttons.size() < 8) {
                r3 r3Var = this.f49937c;
                d2 d2Var = r3Var.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                if (z4) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = x5.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z4) {
                    d.buttons.add(pageButton);
                }
                r3Var.V2.N(false);
                d2 d2Var2 = r3Var.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                r3Var.f50016e3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f49936b) >= 0 && i10 < d.buttons.size()) {
            r3 r3Var = this.f49937c;
            d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            d.buttons.remove(i10);
            r3Var.V2.N(false);
            d2 d2Var2 = r3Var.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            r3Var.f50016e3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f49936b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f49935a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
