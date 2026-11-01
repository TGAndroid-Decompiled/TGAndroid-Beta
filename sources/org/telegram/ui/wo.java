package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class wo extends org.telegram.ui.Cells.b9 {
    public final cp D;
    public ValueAnimator f43141x;
    public int f43142y;

    public wo(cp cpVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(12, context, p6Var);
        this.D = cpVar;
        this.f43142y = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f43142y != -1) {
            cp cpVar = this.D;
            if (cpVar.f36373n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < cpVar.f36373n.getChildCount(); i14++) {
                    View childAt = cpVar.f36373n.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f43142y - getHeight();
                ValueAnimator valueAnimator = this.f43141x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f43141x = ofFloat;
                ofFloat.addUpdateListener(new eg(arrayList, height, 1));
                this.f43141x.setInterpolator(org.telegram.ui.Components.gr.h);
                this.f43141x.setDuration(350L);
                this.f43141x.start();
            }
        }
        this.f43142y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.i0.W2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            cp cpVar = this.D;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21154p7, cp.Z(cpVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.y41[] y41VarArr = (org.telegram.ui.Components.y41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.y41.class);
            org.telegram.ui.ActionBar.n0 n0Var = cpVar.f36359b;
            if (n0Var != null && n0Var.getText() != null) {
                str = cpVar.f36359b.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < y41VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(y41VarArr[i10]), charSequence.getSpanEnd(y41VarArr[i10]), 33);
                charSequence.removeSpan(y41VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
