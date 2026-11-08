package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.rt0;
public final class v3 extends org.telegram.ui.Cells.h3 {
    public final fh.g E;
    public final int F;
    public final a4 G;

    public v3(a4 a4Var, Context context, rt0 rt0Var, String str, int i7, f6 f6Var, fh.g gVar, int i10) {
        super(context, rt0Var, str, true, i7, f6Var);
        this.G = a4Var;
        this.E = gVar;
        this.F = i10;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        a4 a4Var = this.G;
        ij ijVar = a4Var.f60210e2;
        TLRPC.MessageAction messageAction = a4Var.d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        } else {
            return;
        }
        CharSequence[] charSequenceArr = {a4Var.f60217l2.getText()};
        tL_textWithEntities.entities = ui.b0(this.F).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        ijVar.M5();
        a4Var.f60209c2.g0(ijVar, true);
        a4Var.f60218m2.O(true);
        a4Var.g1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        fh.g gVar = this.E;
        gVar.setBounds(L, 0, measuredWidth, measuredHeight);
        gVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        super.onMeasure(i7, i10);
    }
}
