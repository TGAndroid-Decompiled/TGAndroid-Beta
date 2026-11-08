package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class sh0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.ui.Components.mj, org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public qh0 G;
    public boolean H;
    public final SparseArray I;
    public org.telegram.ui.Components.kn J;
    public long K;
    public int L;
    public qh0 M;
    public org.telegram.ui.Components.di N;
    public Ringtone O;
    public long P;
    public int Q;
    public int R;
    public final ArrayList f49757a;
    public final ArrayList f49758b;
    public final ArrayList f49759c;
    public org.telegram.ui.Components.pj0 d;
    public bi.k5 f49760e;
    public final org.telegram.ui.ActionBar.f6 f49761f;
    public int h;
    public int f49762n;
    public int f49763r;
    public int f49764s;
    public int f49765w;
    public int f49766x;
    public int f49767y;

    public sh0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.f49757a = new ArrayList();
        this.f49758b = new ArrayList();
        this.f49759c = new ArrayList();
        this.F = 100;
        this.I = new SparseArray();
        this.L = -1;
        this.P = 0L;
        this.f49761f = f6Var;
    }

    public static void Z(org.telegram.ui.sh0 r10, android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sh0.Z(org.telegram.ui.sh0, android.content.Context, android.view.View, int):void");
    }

    public static void b0(sh0 sh0Var) {
        sh0Var.I.clear();
        bi.k5 k5Var = sh0Var.f49760e;
        k5Var.k(0, ((sh0) k5Var.d).h);
        sh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i11 = 0; i11 < i2Var.getChildCount(); i11++) {
                View childAt = i2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.xp) {
                        org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) imageView.getDrawable();
                        Drawable drawable = xpVar.f40352a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = xpVar.f40353b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return org.telegram.messenger.id.a0("SoundNameEmpty", null, 2131745281, org.telegram.messenger.id.u(document.date, true));
        }
        return str;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ph0(this, context));
        if (this.K == 0) {
            int i7 = this.L;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747869, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747870, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747871, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747867, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747868, null));
            }
        } else {
            this.J = new org.telegram.ui.Components.kn(context, null, false, this.f49761f);
            if (this.K < 0) {
                if (this.P != 0) {
                    TLRPC.TL_forumTopic f10 = getMessagesController().f24877q7.f(-this.K, this.P);
                    qg.d.p(this.J.getAvatarImageView(), f10, false, true, this.f49761f);
                    this.simpleActionBar.setTitle(f10.title);
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.K));
                    this.J.setChatAvatar(M0);
                    this.simpleActionBar.setTitle(M0.title);
                }
            } else {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.K));
                if (a22 != null) {
                    this.J.setUserAvatar(a22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131747872, null));
            org.telegram.messenger.g0.E2(this.J.f35367e);
            this.simpleActionBar.addView(this.J.f35367e, c8.ha.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.d(2, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131745462, null));
        l10.d(1, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751599, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        bi.k5 k5Var = new bi.k5(this, 8);
        this.f49760e = k5Var;
        k5Var.C(true);
        this.d.setAdapter(this.f49760e);
        ((v4.k) this.d.getItemAnimator()).f57071m = false;
        ((v4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.b0());
        this.d.setOnItemClickListener(new di.p4(20, this, context));
        this.d.setOnItemLongClickListener(new wr(this, 27));
        getMediaDataController().f25857z0.g(false);
        this.f49757a.clear();
        this.f49758b.clear();
        for (int i10 = 0; i10 < getMediaDataController().f25857z0.f59416e.size(); i10++) {
            yf.c cVar = (yf.c) getMediaDataController().f25857z0.f59416e.get(i10);
            ?? obj = new Object();
            int i11 = this.F;
            this.F = i11 + 1;
            obj.f49237c = i11;
            obj.f49235a = true;
            obj.d = cVar.f59410c;
            TLRPC.Document document3 = cVar.f59408a;
            String str = document3.file_name_fixed;
            obj.f49239f = str;
            obj.f49238e = document3;
            obj.f49239f = g0(document3, str);
            obj.f49240g = cVar.f59409b;
            qh0 qh0Var = this.M;
            if (qh0Var != null && (document = qh0Var.f49238e) != null && (document2 = cVar.f59408a) != null && document.f26962id == document2.f26962id) {
                this.M = null;
                this.G = obj;
            }
            this.f49757a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.f25566b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i12 = this.F;
        this.F = i12 + 1;
        obj2.f49237c = i12;
        obj2.f49239f = org.telegram.messenger.id.M0(2131748152, null);
        this.f49758b.add(obj2);
        ?? obj3 = new Object();
        int i13 = this.F;
        this.F = i13 + 1;
        obj3.f49237c = i13;
        obj3.f49239f = org.telegram.messenger.id.M0(2131751600, null);
        obj3.f49236b = true;
        this.f49758b.add(obj3);
        qh0 qh0Var2 = this.M;
        if (qh0Var2 != null && qh0Var2.f49238e == null && qh0Var2.f49240g.equals("NoSound")) {
            this.M = null;
            this.G = obj2;
        }
        qh0 qh0Var3 = this.M;
        if (qh0Var3 != null && qh0Var3.f49238e == null && qh0Var3.f49240g.equals("Default")) {
            this.M = null;
            this.G = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i14 = this.F;
            this.F = i14 + 1;
            obj4.f49237c = i14;
            obj4.f49239f = string;
            obj4.f49240g = str2;
            qh0 qh0Var4 = this.M;
            if (qh0Var4 != null && qh0Var4.f49238e == null && qh0Var4.f49240g.equals(str2)) {
                this.M = null;
                this.G = obj4;
            }
            this.f49758b.add(obj4);
        }
        if (getMediaDataController().f25857z0.f59417f && this.G == null) {
            this.G = obj3;
            this.H = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i7 == org.telegram.messenger.qs.f24995e5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.f49757a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((qh0) arrayList.get(i11)).d), (qh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().f25857z0.f59416e.size(); i12++) {
                yf.c cVar = (yf.c) getMediaDataController().f25857z0.f59416e.get(i12);
                ?? obj = new Object();
                qh0 qh0Var = (qh0) hashMap.get(Integer.valueOf(cVar.f59410c));
                if (qh0Var != null) {
                    if (qh0Var == this.G) {
                        this.G = obj;
                    }
                    obj.f49237c = qh0Var.f49237c;
                } else {
                    int i13 = this.F;
                    this.F = i13 + 1;
                    obj.f49237c = i13;
                }
                obj.f49235a = true;
                obj.d = cVar.f59410c;
                TLRPC.Document document3 = cVar.f59408a;
                if (document3 != null) {
                    obj.f49239f = document3.file_name_fixed;
                } else {
                    obj.f49239f = new File(cVar.f59409b).getName();
                }
                TLRPC.Document document4 = cVar.f59408a;
                obj.f49238e = document4;
                obj.f49239f = g0(document4, obj.f49239f);
                obj.f49240g = cVar.f59409b;
                qh0 qh0Var2 = this.M;
                if (qh0Var2 != null && (document = qh0Var2.f49238e) != null && (document2 = cVar.f59408a) != null && document.f26962id == document2.f26962id) {
                    this.M = null;
                    this.G = obj;
                }
                arrayList.add(obj);
            }
            i0();
            this.f49760e.f();
            if (getMediaDataController().f25857z0.f59417f && this.G == null) {
                ArrayList arrayList2 = this.f49758b;
                if (arrayList2.size() > 0) {
                    this.M = null;
                    this.G = (qh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(qh0 qh0Var) {
        int i7 = qh0Var.f49237c;
        SparseArray sparseArray = this.I;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(qh0Var.f49237c);
        } else if (qh0Var.f49235a) {
            sparseArray.put(qh0Var.f49237c, qh0Var);
        } else {
            return;
        }
        h0();
        bi.k5 k5Var = this.f49760e;
        k5Var.k(0, ((sh0) k5Var.d).h);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f49761f;
    }

    public final void h0() {
        SparseArray sparseArray = this.I;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.x(sparseArray.size(), this.simpleActionBar.s());
            this.simpleActionBar.B();
            return;
        }
        this.simpleActionBar.r();
    }

    public final void i0() {
        this.f49762n = -1;
        this.f49763r = -1;
        this.f49764s = -1;
        this.f49765w = -1;
        this.f49767y = -1;
        this.D = -1;
        this.E = -1;
        this.h = 1;
        ArrayList arrayList = this.f49757a;
        if (!arrayList.isEmpty()) {
            int i7 = this.h;
            this.f49762n = i7;
            int size = arrayList.size() + i7;
            this.h = size;
            this.f49763r = size;
        }
        int i10 = this.h;
        this.f49764s = i10;
        this.h = i10 + 2;
        this.f49765w = i10 + 1;
        ArrayList arrayList2 = this.f49758b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.f49767y = i11;
            this.D = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.E = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.f49766x = i13;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().l2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.qs.f24995e5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 21 && intent != null && this.N != null) {
            Uri data = intent.getData();
            int i11 = org.telegram.messenger.qs.f24995e5;
            boolean z9 = true;
            boolean z10 = false;
            if (data != null) {
                String T0 = org.telegram.messenger.g0.T0(intent.getData());
                if (T0 != null) {
                    if (T0.startsWith("content://")) {
                        T0 = MediaController.t(-1L, intent.getData(), "mp3");
                    }
                    if (this.N.f32949g2.Q(new File(T0))) {
                        getMediaDataController().l2(T0);
                        getNotificationCenter().k(i11, new Object[0]);
                        z10 = z9;
                    }
                }
                z9 = false;
                z10 = z9;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z11 = false;
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.t(-1L, uri, "mp3");
                    }
                    if (this.N.f32949g2.Q(new File(uri2))) {
                        getMediaDataController().l2(uri2);
                        getNotificationCenter().k(i11, new Object[0]);
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                this.N.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.K = getArguments().getLong("dialog_id", 0L);
            this.P = getArguments().getLong("topic_id", 0L);
            this.L = getArguments().getInt("type", -1);
        }
        long j3 = this.K;
        if (j3 != 0) {
            String v = org.telegram.messenger.dt.v(j3, this.P, false);
            str2 = rf.b.i("sound_document_id_", v);
            str = rf.b.i("sound_path_", v);
        } else {
            int i7 = this.L;
            if (i7 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i7 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i7 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i7 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i7 != 4 && i7 != 5) {
                throw new RuntimeException("Unsupported type");
            } else {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.M = obj;
        if (j10 != 0) {
            obj.f49238e = new TLRPC.TL_document();
            this.M.f49238e.f26962id = j10;
        } else {
            obj.f49240g = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.G != null && this.H) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.K != 0) {
                str = "sound_" + org.telegram.messenger.dt.v(this.K, this.P, false);
                str2 = "sound_path_" + org.telegram.messenger.dt.v(this.K, this.P, false);
                str3 = "sound_document_id_" + org.telegram.messenger.dt.v(this.K, this.P, false);
                edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(this.K, this.P, false), true);
            } else {
                int i7 = this.L;
                if (i7 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i7 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i7 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i7 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i7 != 5 && i7 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            qh0 qh0Var = this.G;
            if (qh0Var.f49235a && (document = qh0Var.f49238e) != null) {
                edit.putLong(str3, document.f26962id);
                edit.putString(str, this.G.f49239f);
                edit.putString(str2, "NoSound");
            } else if (qh0Var.f49240g != null) {
                edit.putString(str, qh0Var.f49239f);
                edit.putString(str2, this.G.f49240g);
                edit.remove(str3);
            } else if (qh0Var.f49236b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.K != 0) {
                getNotificationsController().c0(this.K, this.P, true);
                return;
            }
            getNotificationsController().b0(this.L);
            getNotificationCenter().k(org.telegram.messenger.qs.f24996f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24995e5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.qs.f24995e5);
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f49761f;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, f6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27982k7, f6Var);
            if (this.d != null) {
                if (w02 == this.Q && w03 == this.R) {
                    return;
                }
                this.Q = w02;
                this.R = w03;
                for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
                    f0(this.d.getChildAt(i7), w02, w03);
                }
                for (int i10 = 0; i10 < this.d.getCachedChildCount(); i10++) {
                    f0(this.d.P(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getHiddenChildCount(); i11++) {
                    f0(this.d.V(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getAttachedScrapChildCount(); i12++) {
                    f0(this.d.O(i12), w02, w03);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
