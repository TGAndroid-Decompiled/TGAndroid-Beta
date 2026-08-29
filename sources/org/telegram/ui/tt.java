package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class tt extends org.telegram.ui.Components.xa {
    public final FrameLayout T;
    public final nh.d U;
    public final nh.d V;
    public final ArrayList W;
    public final HashSet X;
    public boolean Y;
    public org.telegram.ui.Components.k51 Z;

    public tt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, false, 1, new lh.b());
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        HashSet hashSet2 = new HashSet();
        this.X = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T = frameLayout;
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        frameLayout.addView(f9, i7.f6.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        i7.h6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final tt f42460b;

            {
                this.f42460b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42460b.dismiss();
                        return;
                    case 1:
                        this.f42460b.S(false);
                        return;
                    default:
                        this.f42460b.S(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, i7.f6.e(56, 56, 17));
        f9.addView(frameLayout2, i7.f6.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.y80 a2 = i7.j6.a(activity, 20.0f, i10, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        f9.addView(a2, i7.f6.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.y80 a10 = i7.j6.a(activity, 14.0f, i10, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(nh.t3.a(a10.getText(), a10.getPaint()));
        f9.addView(a10, i7.f6.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.k51 k51Var = this.Z;
        if (k51Var != null) {
            k51Var.N(false);
        }
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new c1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.x3.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, i7.f6.e(-1, -2, 87));
        nh.d dVar = new nh.d(activity, this.resourcesProvider, true);
        this.U = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        f10.addView(dVar, i7.f6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final tt f42460b;

            {
                this.f42460b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42460b.dismiss();
                        return;
                    case 1:
                        this.f42460b.S(false);
                        return;
                    default:
                        this.f42460b.S(true);
                        return;
                }
            }
        });
        nh.d dVar2 = new nh.d(activity, this.resourcesProvider, true);
        this.V = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.iq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        f10.addView(dVar2, i7.f6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final tt f42460b;

            {
                this.f42460b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42460b.dismiss();
                        return;
                    case 1:
                        this.f42460b.S(false);
                        return;
                    default:
                        this.f42460b.S(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, i7.f6.e(-1, -2, 87));
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(76.0f));
    }

    public static void Q(tt ttVar, TLObject tLObject, nh.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(ttVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(ttVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.voip.o(5, ttVar, updates));
            if (groupCall != null && LaunchActivity.C1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f22409id = groupCall.f22402id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                ttVar.dismiss();
                org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, ttVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            ttVar.Y = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(ttVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(ttVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.C1 == null) {
                ttVar.Y = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f22409id = groupCall2.f22402id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            ttVar.dismiss();
            org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, ttVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            th.t(ttVar.topBulletinContainer, ttVar.resourcesProvider, tL_error, false);
        }
    }

    public static void R(tt ttVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.w41.k(ttVar.T));
        arrayList.add(org.telegram.ui.Components.w41.B(null));
        ArrayList arrayList2 = ttVar.W;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            th.p(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l10 = (Long) arrayList2.get(i10);
                l10.getClass();
                TLRPC.User user = MessagesController.getInstance(ttVar.currentAccount).getUser(l10);
                if (user != null) {
                    int i11 = ig.m.f9006a;
                    org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(ig.m.class);
                    J.G = user;
                    J.K(ttVar.X.contains(l10));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    public final void S(boolean z10) {
        nh.d dVar;
        if (this.Y) {
            return;
        }
        this.Y = true;
        if (z10) {
            dVar = this.V;
        } else {
            dVar = this.U;
        }
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.X);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new nh.q1(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, true, new b5(this, 10), this.resourcesProvider);
        this.Z = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
