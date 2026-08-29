package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qw extends ChatActivityEnterView {
    public final fy f41790j5;

    public qw(fy fyVar, Activity activity, xx xxVar) {
        super(activity, xxVar, null, false, null);
        this.f41790j5 = fyVar;
    }

    @Override
    public final void A0(float f9) {
        fy fyVar = this.f41790j5;
        fyVar.f38359u1.setInputBubbleHeight(f9);
        fyVar.s3();
        fyVar.m3();
        fyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            fy fyVar = this.f41790j5;
            Activity parentActivity = fyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        fy fyVar = this.f41790j5;
        int i10 = fyVar.O0;
        qw qwVar = fyVar.f38373x1;
        if (qwVar == null) {
            fieldText = "";
        } else {
            fieldText = qwVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        fy fyVar = this.f41790j5;
        ArrayList arrayList = fyVar.E2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = fyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(fyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
