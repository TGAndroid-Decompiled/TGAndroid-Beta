package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xo extends org.telegram.ui.Cells.a9 {
    public ValueAnimator v;
    public int f43441w;
    public final ep f43442x;

    public xo(ep epVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 12, g6Var);
        this.f43442x = epVar;
        this.f43441w = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.f43441w != -1) {
            ep epVar = this.f43442x;
            if (epVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (int i14 = 0; i14 < epVar.h.getChildCount(); i14++) {
                    View childAt = epVar.h.getChildAt(i14);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
                    }
                }
                float height = this.f43441w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new gg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.pr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f43441w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ep epVar = this.f43442x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(epVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.g51[] g51VarArr = (org.telegram.ui.Components.g51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.g51.class);
            lg.f fVar = epVar.f36629a;
            if (fVar != null && fVar.getText() != null) {
                str = epVar.f36629a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < g51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(g51VarArr[i10]), charSequence.getSpanEnd(g51VarArr[i10]), 33);
                charSequence.removeSpan(g51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
