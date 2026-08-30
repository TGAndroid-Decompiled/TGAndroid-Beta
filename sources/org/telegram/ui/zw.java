package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zw extends ChatActivityEnterView {
    public final oy f40872k5;

    public zw(oy oyVar, Activity activity, hy hyVar) {
        super(activity, hyVar, null, false, null);
        this.f40872k5 = oyVar;
    }

    @Override
    public final void A0(float f10) {
        oy oyVar = this.f40872k5;
        oyVar.f37111v1.setInputBubbleHeight(f10);
        oyVar.s3();
        oyVar.m3();
        oyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            oy oyVar = this.f40872k5;
            Activity parentActivity = oyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        oy oyVar = this.f40872k5;
        int i10 = oyVar.P0;
        zw zwVar = oyVar.f37126y1;
        if (zwVar == null) {
            fieldText = "";
        } else {
            fieldText = zwVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        oy oyVar = this.f40872k5;
        ArrayList arrayList = oyVar.F2;
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
            long sendPaidMessagesStars = oyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(oyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
