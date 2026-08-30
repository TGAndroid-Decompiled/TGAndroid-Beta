package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xo extends org.telegram.ui.Cells.a9 {
    public ValueAnimator v;
    public int f40272w;
    public final dp f40273x;

    public xo(dp dpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.f40273x = dpVar;
        this.f40272w = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.f40272w != -1) {
            dp dpVar = this.f40273x;
            if (dpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (int i14 = 0; i14 < dpVar.h.getChildCount(); i14++) {
                    View childAt = dpVar.h.getChildAt(i14);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
                    }
                }
                float height = this.f40272w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new gg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.nr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f40272w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            dp dpVar = this.f40273x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(dpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.f51[] f51VarArr = (org.telegram.ui.Components.f51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.f51.class);
            kg.f fVar = dpVar.f33746a;
            if (fVar != null && fVar.getText() != null) {
                str = dpVar.f33746a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < f51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(f51VarArr[i10]), charSequence.getSpanEnd(f51VarArr[i10]), 33);
                charSequence.removeSpan(f51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
