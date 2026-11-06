package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class zn extends org.telegram.ui.Cells.z8 {
    public final go D;
    public ValueAnimator f52612x;
    public int f52613y;

    public zn(go goVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(12, context, f6Var);
        this.D = goVar;
        this.f52613y = -1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f52613y != -1) {
            go goVar = this.D;
            if (goVar.f46036n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (int i13 = 0; i13 < goVar.f46036n.getChildCount(); i13++) {
                    View childAt = goVar.f46036n.getChildAt(i13);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
                    }
                }
                float height = this.f52613y - getHeight();
                ValueAnimator valueAnimator = this.f52612x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f52612x = ofFloat;
                ofFloat.addUpdateListener(new sf(arrayList, height, 1));
                this.f52612x.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f52612x.setDuration(350L);
                this.f52612x.start();
            }
        }
        this.f52613y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            go goVar = this.D;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.f28069p7, go.Z(goVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.o31[] o31VarArr = (org.telegram.ui.Components.o31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.o31.class);
            ah.i iVar = goVar.f46021b;
            if (iVar != null && iVar.getText() != null) {
                str = goVar.f46021b.getText().toString();
            } else {
                str = "";
            }
            for (int i7 = 0; i7 < o31VarArr.length; i7++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(o31VarArr[i7]), charSequence.getSpanEnd(o31VarArr[i7]), 33);
                charSequence.removeSpan(o31VarArr[i7]);
            }
        }
        super.setText(charSequence);
    }
}
