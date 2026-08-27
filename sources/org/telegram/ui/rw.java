package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class rw extends ChatActivityEnterView {

    public final gy f42352j5;

    public rw(gy gyVar, Activity activity, yx yxVar) {
        super(activity, yxVar, null, false, null);
        this.f42352j5 = gyVar;
    }

    @Override
    public final void A0(float f10) {
        gy gyVar = this.f42352j5;
        gyVar.f38601u1.setInputBubbleHeight(f10);
        gyVar.s3();
        gyVar.m3();
        gyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            gy gyVar = this.f42352j5;
            AndroidUtilities.requestAdjustResize(gyVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) gyVar).classGuid);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        gy gyVar = this.f42352j5;
        int i10 = gyVar.O0;
        rw rwVar = gyVar.f38615x1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(rwVar == null ? "" : rwVar.getFieldText()) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        gy gyVar = this.f42352j5;
        ArrayList arrayList = gyVar.E2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long jLongValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = gyVar.getMessagesController().getSendPaidMessagesStars(jLongValue);
            if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(gyVar.getMessagesController().isUserContactBlocked(jLongValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
