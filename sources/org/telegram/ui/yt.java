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
public final class yt extends org.telegram.ui.Components.bb {
    public final FrameLayout X;
    public final ci.d Y;
    public final ci.d Z;
    public final ArrayList f40246a0;
    public final HashSet f40247b0;
    public boolean f40248c0;
    public org.telegram.ui.Components.j61 f40249d0;

    public yt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new ai.d());
        ArrayList arrayList = new ArrayList();
        this.f40246a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.f40247b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout e = org.telegram.messenger.f0.e(activity, 1);
        frameLayout.addView(e, w7.y5.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.y5.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        w7.a6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final yt f39983b;

            {
                this.f39983b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39983b.dismiss();
                        return;
                    case 1:
                        this.f39983b.S(false);
                        return;
                    default:
                        this.f39983b.S(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.y5.e(56, 56, 17));
        e.addView(frameLayout2, w7.y5.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.Components.n90 a2 = w7.c6.a(activity, 20.0f, i10, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        e.addView(a2, w7.y5.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.n90 a10 = w7.c6.a(activity, 14.0f, i10, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(ci.e4.a(a10.getText(), a10.getPaint()));
        e.addView(a10, w7.y5.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.j61 j61Var = this.f40249d0;
        if (j61Var != null) {
            j61Var.N(false);
        }
        s4.j jVar = new s4.j();
        jVar.f42995m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new z0(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e7 = org.telegram.messenger.f0.e(activity, 0);
        e7.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(e7, w7.y5.e(-1, -2, 87));
        ci.d dVar = new ci.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        e7.addView(dVar, w7.y5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final yt f39983b;

            {
                this.f39983b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39983b.dismiss();
                        return;
                    case 1:
                        this.f39983b.S(false);
                        return;
                    default:
                        this.f39983b.S(true);
                        return;
                }
            }
        });
        ci.d dVar2 = new ci.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.pq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        e7.addView(dVar2, w7.y5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final yt f39983b;

            {
                this.f39983b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39983b.dismiss();
                        return;
                    case 1:
                        this.f39983b.S(false);
                        return;
                    default:
                        this.f39983b.S(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, w7.y5.e(-1, -2, 87));
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(76.0f));
    }

    public static void Q(yt ytVar, TLObject tLObject, ci.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(ytVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(ytVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new tt(1, ytVar, updates));
            if (groupCall != null && LaunchActivity.G1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f18352id = groupCall.f18345id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                ytVar.dismiss();
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, ytVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            ytVar.f40248c0 = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(ytVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(ytVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 == null) {
                ytVar.f40248c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f18352id = groupCall2.f18345id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            ytVar.dismiss();
            org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, ytVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.c1.r(ytVar.topBulletinContainer, ytVar.resourcesProvider, tL_error, false);
        }
    }

    public static void R(yt ytVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.v51.k(ytVar.X));
        arrayList.add(org.telegram.ui.Components.v51.B(null));
        ArrayList arrayList2 = ytVar.f40246a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                TLRPC.User user = MessagesController.getInstance(ytVar.currentAccount).getUser(l4);
                if (user != null) {
                    int i11 = xg.k.f46062a;
                    org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(xg.k.class);
                    J.G = user;
                    J.K(ytVar.f40247b0.contains(l4));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    public final void S(boolean z10) {
        ci.d dVar;
        if (this.f40248c0) {
            return;
        }
        this.f40248c0 = true;
        if (z10) {
            dVar = this.Z;
        } else {
            dVar = this.Y;
        }
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f40247b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ci.t1(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.vl0 v(org.telegram.ui.Components.wl0 wl0Var) {
        org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(wl0Var, getContext(), this.currentAccount, 0, true, new b5(this, 10), this.resourcesProvider);
        this.f40249d0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
