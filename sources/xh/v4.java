package xh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cw0;
public final class v4 extends org.telegram.ui.Cells.g3 {
    public final a5 E;
    public final ch.f f46514x;
    public final int f46515y;

    public v4(a5 a5Var, Context context, cw0 cw0Var, String str, int i10, e6 e6Var, ch.f fVar, int i11) {
        super(context, cw0Var, str, true, i10, e6Var);
        this.E = a5Var;
        this.f46514x = fVar;
        this.f46515y = i11;
    }

    @Override
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        a5 a5Var = this.E;
        MessageObject messageObject = a5Var.m0;
        TLRPC.MessageAction messageAction = a5Var.f46130l0;
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
        CharSequence[] charSequenceArr = {a5Var.f46136s0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.f46515y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        a5Var.f46129k0.U(messageObject, true);
        a5Var.f46137t0.N(true);
        a5Var.Z(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        ch.f fVar = this.f46514x;
        fVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
