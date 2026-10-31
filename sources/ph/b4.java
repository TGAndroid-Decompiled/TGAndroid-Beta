package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.uu0;
public final class b4 extends org.telegram.ui.Cells.j3 {
    public final vg.f E;
    public final int F;
    public final g4 G;

    public b4(g4 g4Var, Context context, uu0 uu0Var, String str, int i10, p6 p6Var, vg.f fVar, int i11) {
        super(context, uu0Var, str, true, i10, p6Var);
        this.G = g4Var;
        this.E = fVar;
        this.F = i11;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        g4 g4Var = this.G;
        jj jjVar = g4Var.f45073e2;
        TLRPC.MessageAction messageAction = g4Var.f45072d2;
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
        CharSequence[] charSequenceArr = {g4Var.f45080l2.getText()};
        tL_textWithEntities.entities = ui.b0(this.F).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        jjVar.K5();
        g4Var.f45071c2.f0(jjVar, true);
        g4Var.f45081m2.O(true);
        g4Var.g1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        vg.f fVar = this.E;
        fVar.setBounds(L, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
