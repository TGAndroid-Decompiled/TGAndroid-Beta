package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.vw0;
public final class t4 extends org.telegram.ui.Cells.d3 {
    public final int E;
    public final y4 F;
    public final eh.f f53257y;

    public t4(y4 y4Var, Context context, vw0 vw0Var, String str, int i10, u6 u6Var, eh.f fVar, int i11) {
        super(context, vw0Var, str, true, i10, u6Var);
        this.F = y4Var;
        this.f53257y = fVar;
        this.E = i11;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        y4 y4Var = this.F;
        MessageObject messageObject = y4Var.m0;
        TLRPC.MessageAction messageAction = y4Var.f53346l0;
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
        CharSequence[] charSequenceArr = {y4Var.f53353t0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.E).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        y4Var.f53345k0.X(messageObject, true);
        y4Var.f53354u0.O(true);
        y4Var.Z(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        eh.f fVar = this.f53257y;
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
