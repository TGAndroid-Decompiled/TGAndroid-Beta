package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class wo extends org.telegram.ui.Components.zk0 {
    public static final int X2 = 0;
    public final vo T2;
    public boolean U2;
    public final Paint V2;
    public final xo W2;

    public wo(xo xoVar, Context context) {
        super(context, null);
        this.W2 = xoVar;
        this.U2 = false;
        this.V2 = new Paint(1);
        vo voVar = new vo(this);
        this.T2 = voVar;
        setAdapter(voVar);
        setLayoutManager(new f2.k0());
        setOnItemClickListener(new uo(this));
        new f2.f0(new kh.g(this, 1)).d(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iR;
        int size = this.W2.J.size();
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && (iR = RecyclerView.R(childAt)) >= 1 && iR <= size) {
                iMin = Math.min(childAt.getTop(), iMin);
                iMax = Math.max(childAt.getBottom(), iMax);
            }
        }
        if (iMin < iMax) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f35277l2);
            Paint paint = this.V2;
            paint.setColor(iV0);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, iMin, getWidth(), iMax, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
    }

    public final void w1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int iMin;
        xo xoVar = this.W2;
        ArrayList arrayList = xoVar.J;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == tL_username) {
                int i12 = i11 + 1;
                if (i11 < 0 || i11 >= arrayList.size() || (tL_username2 = (TLRPC.TL_username) arrayList.get(i11)) == null) {
                    return;
                }
                int i13 = -1;
                if (tL_username2.active != z10) {
                    tL_username2.active = z10;
                    if (z10) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList.size()) {
                                i14 = -1;
                                break;
                            } else if (!((TLRPC.TL_username) arrayList.get(i14)).active) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (i14 >= 0) {
                            iMin = Math.max(0, i14 - 1);
                            i13 = iMin + 1;
                        }
                    } else {
                        int i15 = -1;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            if (((TLRPC.TL_username) arrayList.get(i16)).active) {
                                i15 = i16;
                            }
                        }
                        if (i15 >= 0) {
                            iMin = Math.min(arrayList.size() - 1, i15 + 1);
                            i13 = iMin + 1;
                        }
                    }
                }
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    View childAt = getChildAt(i17);
                    if (RecyclerView.R(childAt) == i12) {
                        if (z11) {
                            AndroidUtilities.shakeView(childAt);
                        }
                        if (!(childAt instanceof ka)) {
                            break;
                        }
                        ka kaVar = (ka) childAt;
                        kaVar.setLoading(xoVar.L.contains(tL_username2.username));
                        TLRPC.TL_username tL_username3 = kaVar.v;
                        if (tL_username3 == null) {
                            break;
                        }
                        kaVar.a(tL_username3, kaVar.f39677w, true, kaVar.f39678x);
                        break;
                    }
                }
                if (i13 < 0 || i12 == i13) {
                    return;
                }
                int i18 = i13 - 1;
                vo voVar = this.T2;
                ArrayList arrayList2 = voVar.f43494c.W2.J;
                if (i11 >= arrayList2.size() || i18 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i18, (TLRPC.TL_username) arrayList2.remove(i11));
                voVar.p(i12, i13);
                while (i10 < arrayList2.size()) {
                    i10++;
                    voVar.m(i10);
                }
                return;
            }
        }
    }
}
