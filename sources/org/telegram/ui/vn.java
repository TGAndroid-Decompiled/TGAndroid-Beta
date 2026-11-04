package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class vn extends org.telegram.ui.Cells.y8 {
    public final bo E;
    public ValueAnimator f50564x;
    public int f50565y;

    public vn(bo boVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(12, context, e6Var);
        this.E = boVar;
        this.f50565y = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f50565y != -1) {
            bo boVar = this.E;
            if (boVar.f44105n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < boVar.f44105n.getChildCount(); i13++) {
                    View childAt = boVar.f44105n.getChildAt(i13);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f50565y - getHeight();
                ValueAnimator valueAnimator = this.f50564x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f50564x = ofFloat;
                ofFloat.addUpdateListener(new of(arrayList, height, 1));
                this.f50564x.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f50564x.setDuration(350L);
                this.f50564x.start();
            }
        }
        this.f50565y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            bo boVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28102p7, bo.Z(boVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.o31[] o31VarArr = (org.telegram.ui.Components.o31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.o31.class);
            bh.g gVar = boVar.f44090b;
            if (gVar != null && gVar.getText() != null) {
                str = boVar.f44090b.getText().toString();
            } else {
                str = "";
            }
            for (int i3 = 0; i3 < o31VarArr.length; i3++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(o31VarArr[i3]), charSequence.getSpanEnd(o31VarArr[i3]), 33);
                charSequence.removeSpan(o31VarArr[i3]);
            }
        }
        super.setText(charSequence);
    }
}
