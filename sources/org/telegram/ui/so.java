package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class so extends org.telegram.ui.Cells.e9 {
    public ValueAnimator f41772w;
    public int f41773x;
    public final yo f41774y;

    public so(yo yoVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 12, g6Var);
        this.f41774y = yoVar;
        this.f41773x = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f41773x != -1) {
            yo yoVar = this.f41774y;
            if (yoVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < yoVar.h.getChildCount(); i14++) {
                    View childAt = yoVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f41773x - getHeight();
                ValueAnimator valueAnimator = this.f41772w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41772w = ofFloat;
                ofFloat.addUpdateListener(new fg(arrayList, height, 1));
                this.f41772w.setInterpolator(org.telegram.ui.Components.zr.h);
                this.f41772w.setDuration(350L);
                this.f41772w.start();
            }
        }
        this.f41773x = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            yo yoVar = this.f41774y;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.k10(org.telegram.ui.ActionBar.k6.f21405p7, yo.U(yoVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.i61[] i61VarArr = (org.telegram.ui.Components.i61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.i61.class);
            ei.e2 e2Var = yoVar.f43899a;
            if (e2Var != null && e2Var.getText() != null) {
                str = yoVar.f43899a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < i61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(i61VarArr[i10]), charSequence.getSpanEnd(i61VarArr[i10]), 33);
                charSequence.removeSpan(i61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
