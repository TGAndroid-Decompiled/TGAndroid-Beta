package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class zo extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f40535w;
    public final fp f40536x;

    public zo(fp fpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 12, d6Var);
        this.f40536x = fpVar;
        this.f40535w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f40535w != -1) {
            fp fpVar = this.f40536x;
            if (fpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < fpVar.h.getChildCount(); i14++) {
                    View childAt = fpVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f40535w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new ig(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.rr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f40535w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            fp fpVar = this.f40536x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(fpVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19265p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.s51[] s51VarArr = (org.telegram.ui.Components.s51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.s51.class);
            ci.h2 h2Var = fpVar.f33694a;
            if (h2Var != null && h2Var.getText() != null) {
                str = fpVar.f33694a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < s51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(s51VarArr[i10]), charSequence.getSpanEnd(s51VarArr[i10]), 33);
                charSequence.removeSpan(s51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
