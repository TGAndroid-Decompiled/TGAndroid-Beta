package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class ut extends org.telegram.ui.Components.ha {
    public final FrameLayout P1;
    public final vh.d Q1;
    public final vh.d R1;
    public final ArrayList S1;
    public final HashSet T1;
    public boolean U1;
    public org.telegram.ui.Components.p51 V1;

    public ut(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new th.b());
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.T1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        Q(org.telegram.ui.ActionBar.t6.f21001h5);
        this.f21613s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.P1 = frameLayout;
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        frameLayout.addView(e, w7.b6.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131231270);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        w7.e6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ut f41643b;

            {
                this.f41643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41643b.dismiss();
                        return;
                    case 1:
                        this.f41643b.d1(false);
                        return;
                    default:
                        this.f41643b.d1(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, p6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131231091);
        frameLayout2.addView(imageView2, w7.b6.e(56, 56, 17));
        e.addView(frameLayout2, w7.b6.t(80, 80, 1, 2, 21, 2, 13));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(activity, 20.0f, i11, true, this.I0);
        a2.setText(org.telegram.messenger.cd.L0(2131749492, null));
        a2.setGravity(17);
        e.addView(a2, w7.b6.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.p80 a10 = w7.g6.a(activity, 14.0f, i11, false, this.I0);
        a10.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749493, null)));
        a10.setGravity(17);
        a10.setMaxWidth(vh.p2.a(a10.getText(), a10.getPaint()));
        e.addView(a10, w7.b6.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.p51 p51Var = this.V1;
        if (p51Var != null) {
            p51Var.O(false);
        }
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.f26666k1.setItemAnimator(jVar);
        this.f26666k1.setOnItemClickListener(new tt(this, 0));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e7 = org.telegram.messenger.m5.e(activity, 0);
        e7.setPadding(org.telegram.messenger.i0.L(14.0f) + this.f21615t0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f) + this.f21615t0, org.telegram.messenger.i0.L(14.0f));
        frameLayout3.addView(e7, w7.b6.e(-1, -2, 87));
        vh.d dVar = new vh.d(activity, this.I0, true);
        this.Q1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131232619, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131749490, null));
        dVar.i(spannableStringBuilder, false, true);
        e7.addView(dVar, w7.b6.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final ut f41643b;

            {
                this.f41643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41643b.dismiss();
                        return;
                    case 1:
                        this.f41643b.d1(false);
                        return;
                    default:
                        this.f41643b.d1(true);
                        return;
                }
            }
        });
        vh.d dVar2 = new vh.d(activity, this.I0, true);
        this.R1 = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(2131232621, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131749491, null));
        dVar2.i(spannableStringBuilder2, false, true);
        e7.addView(dVar2, w7.b6.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ut f41643b;

            {
                this.f41643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41643b.dismiss();
                        return;
                    case 1:
                        this.f41643b.d1(false);
                        return;
                    default:
                        this.f41643b.d1(true);
                        return;
                }
            }
        });
        this.f21586b.addView(frameLayout3, w7.b6.e(-1, -2, 87));
        org.telegram.ui.Components.tk0 tk0Var = this.f26666k1;
        int i12 = this.f21615t0;
        tk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(76.0f));
    }

    @Override
    public final org.telegram.ui.Components.sk0 L0(org.telegram.ui.Components.tk0 tk0Var) {
        org.telegram.ui.Components.p51 p51Var = new org.telegram.ui.Components.p51(tk0Var, getContext(), this.f21583a, 0, true, new z4(this, 10), this.I0);
        this.V1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131749492, null);
    }

    public final void d1(boolean z10) {
        vh.d dVar;
        if (this.U1) {
            return;
        }
        this.U1 = true;
        if (z10) {
            dVar = this.R1;
        } else {
            dVar = this.Q1;
        }
        vh.d dVar2 = dVar;
        dVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.T1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.f14519b.nextInt();
        ConnectionsManager.getInstance(this.f21583a).sendRequest(createconferencecall, new org.telegram.messenger.s6(this, dVar2, z10, hashSet, 5));
    }
}
