package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class wo extends org.telegram.ui.Cells.i9 {
    public ValueAnimator f45377w;
    public int f45378x;
    public final cp f45379y;

    public wo(cp cpVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 12, u6Var);
        this.f45379y = cpVar;
        this.f45378x = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f45378x != -1) {
            cp cpVar = this.f45379y;
            if (cpVar.f38417n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < cpVar.f38417n.getChildCount(); i14++) {
                    View childAt = cpVar.f38417n.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f45378x - getHeight();
                ValueAnimator valueAnimator = this.f45377w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f45377w = ofFloat;
                ofFloat.addUpdateListener(new eg(arrayList, height, 1));
                this.f45377w.setInterpolator(org.telegram.ui.Components.ds.h);
                this.f45377w.setDuration(350L);
                this.f45377w.start();
            }
        }
        this.f45378x = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            cp cpVar = this.f45379y;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23582p7, cp.V(cpVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.r61[] r61VarArr = (org.telegram.ui.Components.r61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.r61.class);
            fi.c2 c2Var = cpVar.f38403b;
            if (c2Var != null && c2Var.getText() != null) {
                str = cpVar.f38403b.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < r61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(r61VarArr[i10]), charSequence.getSpanEnd(r61VarArr[i10]), 33);
                charSequence.removeSpan(r61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
