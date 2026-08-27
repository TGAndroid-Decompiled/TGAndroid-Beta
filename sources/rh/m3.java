package rh;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class m3 {

    public final a f47269a;

    public final int f47270b;

    public final p3 f47271c;

    public m3(p3 p3Var, a aVar, int i10) {
        this.f47271c = p3Var;
        this.f47269a = aVar;
        this.f47270b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow pageblockbuttonrowD;
        if (TextUtils.isEmpty(str) || !c4.c(inlineButtonType) || (pageblockbuttonrowD = d()) == null) {
            return;
        }
        int i10 = this.f47270b;
        boolean z10 = i10 >= 0 && i10 < pageblockbuttonrowD.buttons.size();
        if (z10 || pageblockbuttonrowD.buttons.size() < 8) {
            p3 p3Var = this.f47271c;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? pageblockbuttonrowD.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = v5.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                pageblockbuttonrowD.buttons.add(pageButton);
            }
            p3Var.U2.N(false);
            b2 b2Var2 = p3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            p3Var.f47340d3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow pageblockbuttonrowD = d();
        if (pageblockbuttonrowD == null || (i10 = this.f47270b) < 0 || i10 >= pageblockbuttonrowD.buttons.size()) {
            return;
        }
        p3 p3Var = this.f47271c;
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        pageblockbuttonrowD.buttons.remove(i10);
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.f47340d3.onContentChanged();
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow pageblockbuttonrowD = d();
        return pageblockbuttonrowD != null && (i10 = this.f47270b) >= 0 && i10 < pageblockbuttonrowD.buttons.size();
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f47269a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            return (TL_iv.pageBlockButtonRow) pageBlock;
        }
        return null;
    }
}
