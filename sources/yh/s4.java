package yh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ow0;
public final class s4 extends org.telegram.ui.Cells.g3 {
    public final x4 E;
    public final dh.f f49119x;
    public final int f49120y;

    public s4(x4 x4Var, Context context, ow0 ow0Var, String str, int i10, c6 c6Var, dh.f fVar, int i11) {
        super(context, ow0Var, str, true, i10, c6Var);
        this.E = x4Var;
        this.f49119x = fVar;
        this.f49120y = i11;
    }

    @Override
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        x4 x4Var = this.E;
        MessageObject messageObject = x4Var.m0;
        TLRPC.MessageAction messageAction = x4Var.f49210l0;
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
        CharSequence[] charSequenceArr = {x4Var.f49216s0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.f49120y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        x4Var.f49209k0.Y(messageObject, true);
        x4Var.f49217t0.N(true);
        x4Var.a0(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        dh.f fVar = this.f49119x;
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
