package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class zo extends org.telegram.ui.Cells.z8 {
    public ValueAnimator v;
    public int f40838w;
    public final fp f40839x;

    public zo(fp fpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.f40839x = fpVar;
        this.f40838w = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.f40838w != -1) {
            fp fpVar = this.f40839x;
            if (fpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (int i14 = 0; i14 < fpVar.h.getChildCount(); i14++) {
                    View childAt = fpVar.h.getChildAt(i14);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
                    }
                }
                float height = this.f40838w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new ig(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.mr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f40838w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            fp fpVar = this.f40839x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(fpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20097p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.f51[] f51VarArr = (org.telegram.ui.Components.f51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.f51.class);
            kg.f fVar = fpVar.f34177a;
            if (fVar != null && fVar.getText() != null) {
                str = fpVar.f34177a.getText().toString();
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
