package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zo extends org.telegram.ui.Components.mm0 {
    public static final int f46337j3 = 0;
    public final yo f46338f3;
    public boolean f46339g3;
    public final Paint f46340h3;
    public final ap f46341i3;

    public zo(ap apVar, Context context) {
        super(context, null);
        this.f46341i3 = apVar;
        this.f46339g3 = false;
        this.f46340h3 = new Paint(1);
        yo yoVar = new yo(this);
        this.f46338f3 = yoVar;
        setAdapter(yoVar);
        setLayoutManager(new s4.c0());
        setOnItemClickListener(new xo(this));
        new s4.z(new ei.f(this, 1)).h(this);
    }

    public final void C1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        ap apVar = this.f46341i3;
        ArrayList arrayList = apVar.N;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == tL_username) {
                int i12 = i11 + 1;
                if (i11 >= 0 && i11 < arrayList.size() && (tL_username2 = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                    int i13 = -1;
                    if (tL_username2.active != z10) {
                        tL_username2.active = z10;
                        if (z10) {
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList.size()) {
                                    if (!((TLRPC.TL_username) arrayList.get(i14)).active) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = -1;
                                    break;
                                }
                            }
                            if (i14 >= 0) {
                                min = Math.max(0, i14 - 1);
                                i13 = min + 1;
                            }
                        } else {
                            int i15 = -1;
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (((TLRPC.TL_username) arrayList.get(i16)).active) {
                                    i15 = i16;
                                }
                            }
                            if (i15 >= 0) {
                                min = Math.min(arrayList.size() - 1, i15 + 1);
                                i13 = min + 1;
                            }
                        }
                    }
                    int i17 = 0;
                    while (true) {
                        if (i17 >= getChildCount()) {
                            break;
                        }
                        View childAt = getChildAt(i17);
                        if (RecyclerView.R(childAt) == i12) {
                            if (z11) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof qa) {
                                qa qaVar = (qa) childAt;
                                qaVar.setLoading(apVar.P.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = qaVar.v;
                                if (tL_username3 != null) {
                                    qaVar.a(tL_username3, qaVar.f42791w, true, qaVar.f42792x);
                                }
                            }
                        } else {
                            i17++;
                        }
                    }
                    if (i13 >= 0 && i12 != i13) {
                        int i18 = i13 - 1;
                        yo yoVar = this.f46338f3;
                        ArrayList arrayList2 = yoVar.f46088c.f46341i3.N;
                        if (i11 < arrayList2.size() && i18 < arrayList2.size()) {
                            arrayList2.add(i18, (TLRPC.TL_username) arrayList2.remove(i11));
                            yoVar.p(i12, i13);
                            while (i10 < arrayList2.size()) {
                                i10++;
                                yoVar.m(i10);
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

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.f46341i3.N.size();
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i10 = Math.min(childAt.getTop(), i10);
                i11 = Math.max(childAt.getBottom(), i11);
            }
        }
        if (i10 < i11) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, this.f30646n2);
            Paint paint = this.f46340h3;
            paint.setColor(w02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i10, getWidth(), i11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
    }
}
