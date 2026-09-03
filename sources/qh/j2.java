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
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.pr;
public final class j2 extends org.telegram.ui.ActionBar.i5 {
    public AnimatorSet f45519f;
    public final z2 h;

    public j2(z2 z2Var) {
        this.h = z2Var;
    }

    @Override
    public final void m() {
        z2 z2Var = this.h;
        k2 k2Var = z2Var.d;
        q2 q2Var = z2Var.C;
        AnimatorSet animatorSet = this.f45519f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        q2Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, property3, 1.0f));
        EditTextBoldCursor searchField = z2Var.D.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        k2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(k2Var, property3, 1.0f));
        k2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(z2Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h2(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45519f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f45519f.setInterpolator(pr.h);
        this.f45519f.playTogether(arrayList);
        this.f45519f.addListener(new ex0(15, this, searchField));
        this.f45519f.start();
    }

    @Override
    public final void n() {
        z2 z2Var = this.h;
        k2 k2Var = z2Var.d;
        FrameLayout frameLayout = z2Var.h;
        q2 q2Var = z2Var.C;
        AnimatorSet animatorSet = this.f45519f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, property3, 0.0f));
        EditTextBoldCursor searchField = z2Var.D.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(k2Var, property3, 0.0f));
        k2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        z2Var.f46399s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h2(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45519f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f45519f.setInterpolator(pr.h);
        this.f45519f.playTogether(arrayList);
        this.f45519f.addListener(new i2(this, 0));
        this.f45519f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        r2 r2Var = this.h.f46398r;
        org.telegram.ui.web.s0 s0Var = r2Var.v;
        if (!TextUtils.equals(r2Var.f46357f, obj)) {
            if (r2Var.f46356e != -1) {
                ConnectionsManager.getInstance(r2Var.f46361w.f46386a).cancelRequest(r2Var.f46356e, true);
                r2Var.f46356e = -1;
            }
            r2Var.d = false;
            r2Var.h = null;
        }
        r2Var.f46357f = obj;
        AndroidUtilities.cancelRunOnUIThread(s0Var);
        if (TextUtils.isEmpty(obj)) {
            r2Var.f46355c.clear();
            r2Var.F(false);
            r2Var.l();
            return;
        }
        r2Var.F(true);
        AndroidUtilities.runOnUIThread(s0Var, 1500L);
    }
}
