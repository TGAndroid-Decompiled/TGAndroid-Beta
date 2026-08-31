package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pr;
public final class k2 extends org.telegram.ui.ActionBar.i5 {
    public AnimatorSet f45551f;
    public final a3 h;

    public k2(a3 a3Var) {
        this.h = a3Var;
    }

    @Override
    public final void m() {
        a3 a3Var = this.h;
        l2 l2Var = a3Var.d;
        r2 r2Var = a3Var.C;
        AnimatorSet animatorSet = this.f45551f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        r2Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(r2Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(r2Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(r2Var, property3, 1.0f));
        EditTextBoldCursor searchField = a3Var.D.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        l2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(l2Var, property3, 1.0f));
        l2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(a3Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new i2(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45551f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f45551f.setInterpolator(pr.h);
        this.f45551f.playTogether(arrayList);
        this.f45551f.addListener(new fx0(15, this, searchField));
        this.f45551f.start();
    }

    @Override
    public final void n() {
        a3 a3Var = this.h;
        l2 l2Var = a3Var.d;
        FrameLayout frameLayout = a3Var.h;
        r2 r2Var = a3Var.C;
        AnimatorSet animatorSet = this.f45551f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(r2Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(r2Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(r2Var, property3, 0.0f));
        EditTextBoldCursor searchField = a3Var.D.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(l2Var, property3, 0.0f));
        l2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        a3Var.f44904s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new i2(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45551f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f45551f.setInterpolator(pr.h);
        this.f45551f.playTogether(arrayList);
        this.f45551f.addListener(new j2(this, 0));
        this.f45551f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        s2 s2Var = this.h.f44903r;
        org.telegram.ui.web.s0 s0Var = s2Var.v;
        if (!TextUtils.equals(s2Var.f46375f, obj)) {
            if (s2Var.f46374e != -1) {
                ConnectionsManager.getInstance(s2Var.f46379w.f44891a).cancelRequest(s2Var.f46374e, true);
                s2Var.f46374e = -1;
            }
            s2Var.d = false;
            s2Var.h = null;
        }
        s2Var.f46375f = obj;
        AndroidUtilities.cancelRunOnUIThread(s0Var);
        if (TextUtils.isEmpty(obj)) {
            s2Var.f46373c.clear();
            s2Var.F(false);
            s2Var.l();
            return;
        }
        s2Var.F(true);
        AndroidUtilities.runOnUIThread(s0Var, 1500L);
    }
}
