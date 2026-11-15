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
public final class vs extends org.telegram.ui.Components.ja {
    public final FrameLayout T1;
    public final hi.d U1;
    public final hi.d V1;
    public final ArrayList W1;
    public final HashSet X1;
    public boolean Y1;
    public org.telegram.ui.Components.p41 Z1;

    public vs(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new fi.b());
        ArrayList arrayList = new ArrayList();
        this.W1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.X1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        Q(org.telegram.ui.ActionBar.j6.f28922h5);
        this.f29714s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T1 = frameLayout;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        frameLayout.addView(e10, c8.ja.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131231269);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        c8.na.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final vs f52017b;

            {
                this.f52017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52017b.dismiss();
                        return;
                    case 1:
                        this.f52017b.d1(false);
                        return;
                    default:
                        this.f52017b.d1(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, e6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131231091);
        frameLayout2.addView(imageView2, c8.ja.e(56, 56, 17));
        e10.addView(frameLayout2, c8.ja.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.z70 a10 = c8.sa.a(activity, 20.0f, i10, true, this.J0);
        a10.setText(org.telegram.messenger.hd.M0(2131749483, null));
        a10.setGravity(17);
        e10.addView(a10, c8.ja.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.z70 a11 = c8.sa.a(activity, 14.0f, i10, false, this.J0);
        a11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749484, null)));
        a11.setGravity(17);
        a11.setMaxWidth(hi.l3.a(a11.getText(), a11.getPaint()));
        e10.addView(a11, c8.ja.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.p41 p41Var = this.Z1;
        if (p41Var != null) {
            p41Var.O(false);
        }
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.n(350L);
        this.f35931o1.setItemAnimator(kVar);
        this.f35931o1.setOnItemClickListener(new zr(this, 1));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 0);
        e11.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f29717u0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + this.f29717u0, org.telegram.messenger.g0.L(14.0f));
        frameLayout3.addView(e11, c8.ja.e(-1, -2, 87));
        hi.d dVar = new hi.d(activity, this.J0, true);
        this.U1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131232623, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749481, null));
        dVar.i(spannableStringBuilder, false, true);
        e11.addView(dVar, c8.ja.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final vs f52017b;

            {
                this.f52017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52017b.dismiss();
                        return;
                    case 1:
                        this.f52017b.d1(false);
                        return;
                    default:
                        this.f52017b.d1(true);
                        return;
                }
            }
        });
        hi.d dVar2 = new hi.d(activity, this.J0, true);
        this.V1 = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(2131232625, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749482, null));
        dVar2.i(spannableStringBuilder2, false, true);
        e11.addView(dVar2, c8.ja.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final vs f52017b;

            {
                this.f52017b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52017b.dismiss();
                        return;
                    case 1:
                        this.f52017b.d1(false);
                        return;
                    default:
                        this.f52017b.d1(true);
                        return;
                }
            }
        });
        this.f29682b.addView(frameLayout3, c8.ja.e(-1, -2, 87));
        org.telegram.ui.Components.uj0 uj0Var = this.f35931o1;
        int i11 = this.f29717u0;
        uj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(76.0f));
    }

    @Override
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(uj0Var, getContext(), this.f29679a, 0, true, new a5(this, 10), this.J0);
        this.Z1 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131749483, null);
    }

    public final void d1(boolean z10) {
        hi.d dVar;
        if (this.Y1) {
            return;
        }
        this.Y1 = true;
        if (z10) {
            dVar = this.V1;
        } else {
            dVar = this.U1;
        }
        hi.d dVar2 = dVar;
        dVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.X1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.f22414b.nextInt();
        ConnectionsManager.getInstance(this.f29679a).sendRequest(createconferencecall, new di.f3(this, dVar2, z10, hashSet, 7));
    }
}
