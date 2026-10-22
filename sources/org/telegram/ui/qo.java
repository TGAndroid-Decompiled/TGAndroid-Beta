package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class qo extends org.telegram.ui.Cells.d9 {
    public ValueAnimator v;
    public int f40943w;
    public final wo f40944x;

    public qo(wo woVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 12, d6Var);
        this.f40944x = woVar;
        this.f40943w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f40943w != -1) {
            wo woVar = this.f40944x;
            if (woVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < woVar.h.getChildCount(); i14++) {
                    View childAt = woVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f40943w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new dg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.bs.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f40943w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            wo woVar = this.f40944x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(woVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21214p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.e61[] e61VarArr = (org.telegram.ui.Components.e61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.e61.class);
            ei.e2 e2Var = woVar.f42909a;
            if (e2Var != null && e2Var.getText() != null) {
                str = woVar.f42909a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < e61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(e61VarArr[i10]), charSequence.getSpanEnd(e61VarArr[i10]), 33);
                charSequence.removeSpan(e61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
