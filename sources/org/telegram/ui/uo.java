package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class uo extends org.telegram.ui.Components.wk0 {
    public static final int X2 = 0;
    public final to T2;
    public boolean U2;
    public final Paint V2;
    public final vo W2;

    public uo(vo voVar, Context context) {
        super(context, null);
        this.W2 = voVar;
        this.U2 = false;
        this.V2 = new Paint(1);
        to toVar = new to(this);
        this.T2 = toVar;
        setAdapter(toVar);
        setLayoutManager(new f2.m0());
        setOnItemClickListener(new so(this));
        new f2.h0(new jh.f(this, 1)).d(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.W2.J.size();
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i9 = Math.min(childAt.getTop(), i9);
                i10 = Math.max(childAt.getBottom(), i10);
            }
        }
        if (i9 < i10) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.f34260l2);
            Paint paint = this.V2;
            paint.setColor(v02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i9, getWidth(), i10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
    }

    public final void w1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        vo voVar = this.W2;
        ArrayList arrayList = voVar.J;
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) == tL_username) {
                int i11 = i10 + 1;
                if (i10 >= 0 && i10 < arrayList.size() && (tL_username2 = (TLRPC.TL_username) arrayList.get(i10)) != null) {
                    int i12 = -1;
                    if (tL_username2.active != z10) {
                        tL_username2.active = z10;
                        if (z10) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList.size()) {
                                    if (!((TLRPC.TL_username) arrayList.get(i13)).active) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i13 = -1;
                                    break;
                                }
                            }
                            if (i13 >= 0) {
                                min = Math.max(0, i13 - 1);
                                i12 = min + 1;
                            }
                        } else {
                            int i14 = -1;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                if (((TLRPC.TL_username) arrayList.get(i15)).active) {
                                    i14 = i15;
                                }
                            }
                            if (i14 >= 0) {
                                min = Math.min(arrayList.size() - 1, i14 + 1);
                                i12 = min + 1;
                            }
                        }
                    }
                    int i16 = 0;
                    while (true) {
                        if (i16 >= getChildCount()) {
                            break;
                        }
                        View childAt = getChildAt(i16);
                        if (RecyclerView.R(childAt) == i11) {
                            if (z11) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof ja) {
                                ja jaVar = (ja) childAt;
                                jaVar.setLoading(voVar.L.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = jaVar.v;
                                if (tL_username3 != null) {
                                    jaVar.a(tL_username3, jaVar.f39422w, true, jaVar.f39423x);
                                }
                            }
                        } else {
                            i16++;
                        }
                    }
                    if (i12 >= 0 && i11 != i12) {
                        int i17 = i12 - 1;
                        to toVar = this.T2;
                        ArrayList arrayList2 = toVar.f43045c.W2.J;
                        if (i10 < arrayList2.size() && i17 < arrayList2.size()) {
                            arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i10));
                            toVar.p(i11, i12);
                            while (i9 < arrayList2.size()) {
                                i9++;
                                toVar.m(i9);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
