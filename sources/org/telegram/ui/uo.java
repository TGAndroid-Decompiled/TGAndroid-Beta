package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class uo extends org.telegram.ui.Cells.i9 {
    public ValueAnimator f44509w;
    public int f44510x;
    public final ap f44511y;

    public uo(ap apVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 12, u6Var);
        this.f44511y = apVar;
        this.f44510x = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f44510x != -1) {
            ap apVar = this.f44511y;
            if (apVar.f37860n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < apVar.f37860n.getChildCount(); i14++) {
                    View childAt = apVar.f37860n.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f44510x - getHeight();
                ValueAnimator valueAnimator = this.f44509w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44509w = ofFloat;
                ofFloat.addUpdateListener(new dg(arrayList, height, 1));
                this.f44509w.setInterpolator(org.telegram.ui.Components.ds.h);
                this.f44509w.setDuration(350L);
                this.f44509w.start();
            }
        }
        this.f44510x = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ap apVar = this.f44511y;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23581p7, ap.V(apVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.q61[] q61VarArr = (org.telegram.ui.Components.q61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.q61.class);
            fi.c2 c2Var = apVar.f37846b;
            if (c2Var != null && c2Var.getText() != null) {
                str = apVar.f37846b.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < q61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(q61VarArr[i10]), charSequence.getSpanEnd(q61VarArr[i10]), 33);
                charSequence.removeSpan(q61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
