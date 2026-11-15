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
public final class uh0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.ui.Components.tj, org.telegram.messenger.is {
    public int E;
    public int F;
    public int G;
    public sh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.sn K;
    public long L;
    public int M;
    public sh0 N;
    public org.telegram.ui.Components.ki O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList f51948a;
    public final ArrayList f51949b;
    public final ArrayList f51950c;
    public org.telegram.ui.Components.uj0 d;
    public di.i4 f51951e;
    public final org.telegram.ui.ActionBar.e6 f51952f;
    public int h;
    public int f51953n;
    public int f51954r;
    public int f51955s;
    public int f51956w;
    public int f51957x;
    public int f51958y;

    public uh0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.f51948a = new ArrayList();
        this.f51949b = new ArrayList();
        this.f51950c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f51952f = e6Var;
    }

    public static void Z(org.telegram.ui.uh0 r10, android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uh0.Z(org.telegram.ui.uh0, android.content.Context, android.view.View, int):void");
    }

    public static void b0(uh0 uh0Var) {
        uh0Var.J.clear();
        di.i4 i4Var = uh0Var.f51951e;
        i4Var.k(0, ((uh0) i4Var.d).h);
        uh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i11 = 0; i11 < i2Var.getChildCount(); i11++) {
                View childAt = i2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.fq) {
                        org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) imageView.getDrawable();
                        Drawable drawable = fqVar.f34673a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = fqVar.f34674b;
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
            return org.telegram.messenger.hd.a0("SoundNameEmpty", null, 2131745278, org.telegram.messenger.hd.u(document.date, true));
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rh0(this, context));
        if (this.L == 0) {
            int i7 = this.M;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747868, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747869, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747870, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747866, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747867, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.sn(context, null, false, this.f51952f);
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic f10 = getMessagesController().f25386r7.f(-this.L, this.Q);
                    qg.c.p(this.K.getAvatarImageView(), f10, false, true, this.f51952f);
                    this.simpleActionBar.setTitle(f10.title);
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L));
                    this.K.setChatAvatar(M0);
                    this.simpleActionBar.setTitle(M0.title);
                }
            } else {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.L));
                if (a22 != null) {
                    this.K.setUserAvatar(a22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131747871, null));
            org.telegram.messenger.g0.E2(this.K.f39351e);
            this.simpleActionBar.addView(this.K.f39351e, c8.ja.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.c5 o4 = this.simpleActionBar.o();
        o4.d(2, 2131232166, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131745459, null));
        o4.d(1, 2131232109, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.d = uj0Var;
        uj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        di.i4 i4Var = new di.i4(this, 8);
        this.f51951e = i4Var;
        i4Var.C(true);
        this.d.setAdapter(this.f51951e);
        ((v4.k) this.d.getItemAnimator()).f58564m = false;
        ((v4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.b0());
        this.d.setOnItemClickListener(new fi.i4(20, this, context));
        this.d.setOnItemLongClickListener(new zr(this, 27));
        getMediaDataController().A0.g(false);
        this.f51948a.clear();
        this.f51949b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.f60627e.size(); i10++) {
            yf.b bVar = (yf.b) getMediaDataController().A0.f60627e.get(i10);
            ?? obj = new Object();
            int i11 = this.G;
            this.G = i11 + 1;
            obj.f51219c = i11;
            obj.f51217a = true;
            obj.d = bVar.f60621c;
            TLRPC.Document document3 = bVar.f60619a;
            String str = document3.file_name_fixed;
            obj.f51221f = str;
            obj.f51220e = document3;
            obj.f51221f = g0(document3, str);
            obj.f51222g = bVar.f60620b;
            sh0 sh0Var = this.N;
            if (sh0Var != null && (document = sh0Var.f51220e) != null && (document2 = bVar.f60619a) != null && document.f28057id == document2.f28057id) {
                this.N = null;
                this.H = obj;
            }
            this.f51948a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.f26609b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i12 = this.G;
        this.G = i12 + 1;
        obj2.f51219c = i12;
        obj2.f51221f = org.telegram.messenger.hd.M0(2131748151, null);
        this.f51949b.add(obj2);
        ?? obj3 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj3.f51219c = i13;
        obj3.f51221f = org.telegram.messenger.hd.M0(2131751599, null);
        obj3.f51218b = true;
        this.f51949b.add(obj3);
        sh0 sh0Var2 = this.N;
        if (sh0Var2 != null && sh0Var2.f51220e == null && sh0Var2.f51222g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        sh0 sh0Var3 = this.N;
        if (sh0Var3 != null && sh0Var3.f51220e == null && sh0Var3.f51222g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i14 = this.G;
            this.G = i14 + 1;
            obj4.f51219c = i14;
            obj4.f51221f = string;
            obj4.f51222g = str2;
            sh0 sh0Var4 = this.N;
            if (sh0Var4 != null && sh0Var4.f51220e == null && sh0Var4.f51222g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f51949b.add(obj4);
        }
        if (getMediaDataController().A0.f60628f && this.H == null) {
            this.H = obj3;
            this.I = true;
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
        if (i7 == org.telegram.messenger.ns.f25492e5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.f51948a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((sh0) arrayList.get(i11)).d), (sh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.f60627e.size(); i12++) {
                yf.b bVar = (yf.b) getMediaDataController().A0.f60627e.get(i12);
                ?? obj = new Object();
                sh0 sh0Var = (sh0) hashMap.get(Integer.valueOf(bVar.f60621c));
                if (sh0Var != null) {
                    if (sh0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f51219c = sh0Var.f51219c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    obj.f51219c = i13;
                }
                obj.f51217a = true;
                obj.d = bVar.f60621c;
                TLRPC.Document document3 = bVar.f60619a;
                if (document3 != null) {
                    obj.f51221f = document3.file_name_fixed;
                } else {
                    obj.f51221f = new File(bVar.f60620b).getName();
                }
                TLRPC.Document document4 = bVar.f60619a;
                obj.f51220e = document4;
                obj.f51221f = g0(document4, obj.f51221f);
                obj.f51222g = bVar.f60620b;
                sh0 sh0Var2 = this.N;
                if (sh0Var2 != null && (document = sh0Var2.f51220e) != null && (document2 = bVar.f60619a) != null && document.f28057id == document2.f28057id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            i0();
            this.f51951e.f();
            if (getMediaDataController().A0.f60628f && this.H == null) {
                ArrayList arrayList2 = this.f51949b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (sh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(sh0 sh0Var) {
        int i7 = sh0Var.f51219c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(sh0Var.f51219c);
        } else if (sh0Var.f51217a) {
            sparseArray.put(sh0Var.f51219c, sh0Var);
        } else {
            return;
        }
        h0();
        di.i4 i4Var = this.f51951e;
        i4Var.k(0, ((uh0) i4Var.d).h);
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f51952f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.A(sparseArray.size(), this.simpleActionBar.v());
            this.simpleActionBar.F();
            return;
        }
        this.simpleActionBar.u();
    }

    public final void i0() {
        this.f51953n = -1;
        this.f51954r = -1;
        this.f51955s = -1;
        this.f51956w = -1;
        this.f51958y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.f51948a;
        if (!arrayList.isEmpty()) {
            int i7 = this.h;
            this.f51953n = i7;
            int size = arrayList.size() + i7;
            this.h = size;
            this.f51954r = size;
        }
        int i10 = this.h;
        this.f51955s = i10;
        this.h = i10 + 2;
        this.f51956w = i10 + 1;
        ArrayList arrayList2 = this.f51949b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.f51958y = i11;
            this.E = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.F = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.f51957x = i13;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().l2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.ns.f25492e5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 21 && intent != null && this.O != null) {
            Uri data = intent.getData();
            int i11 = org.telegram.messenger.ns.f25492e5;
            boolean z10 = true;
            boolean z11 = false;
            if (data != null) {
                String T0 = org.telegram.messenger.g0.T0(intent.getData());
                if (T0 != null) {
                    if (T0.startsWith("content://")) {
                        T0 = MediaController.t(-1L, intent.getData(), "mp3");
                    }
                    if (this.O.f36452k2.R(new File(T0))) {
                        getMediaDataController().l2(T0);
                        getNotificationCenter().k(i11, new Object[0]);
                        z11 = z10;
                    }
                }
                z10 = false;
                z11 = z10;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z12 = false;
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.t(-1L, uri, "mp3");
                    }
                    if (this.O.f36452k2.R(new File(uri2))) {
                        getMediaDataController().l2(uri2);
                        getNotificationCenter().k(i11, new Object[0]);
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.O.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt("type", -1);
        }
        long j3 = this.L;
        if (j3 != 0) {
            String v = org.telegram.messenger.at.v(j3, this.Q, false);
            str2 = r.b.k("sound_document_id_", v);
            str = r.b.k("sound_path_", v);
        } else {
            int i7 = this.M;
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
        this.N = obj;
        if (j10 != 0) {
            obj.f51220e = new TLRPC.TL_document();
            this.N.f51220e.f28057id = j10;
        } else {
            obj.f51222g = string;
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
        if (this.H != null && this.I) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.L != 0) {
                str = "sound_" + org.telegram.messenger.at.v(this.L, this.Q, false);
                str2 = "sound_path_" + org.telegram.messenger.at.v(this.L, this.Q, false);
                str3 = "sound_document_id_" + org.telegram.messenger.at.v(this.L, this.Q, false);
                edit.putBoolean("sound_enabled_" + org.telegram.messenger.at.v(this.L, this.Q, false), true);
            } else {
                int i7 = this.M;
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
            sh0 sh0Var = this.H;
            if (sh0Var.f51217a && (document = sh0Var.f51220e) != null) {
                edit.putLong(str3, document.f28057id);
                edit.putString(str, this.H.f51221f);
                edit.putString(str2, "NoSound");
            } else if (sh0Var.f51222g != null) {
                edit.putString(str, sh0Var.f51221f);
                edit.putString(str2, this.H.f51222g);
                edit.remove(str3);
            } else if (sh0Var.f51218b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.L != 0) {
                getNotificationsController().c0(this.L, this.Q, true);
                return;
            }
            getNotificationsController().b0(this.M);
            getNotificationCenter().k(org.telegram.messenger.ns.f25493f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25492e5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25492e5);
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f51952f;
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.N6, e6Var);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28979k7, e6Var);
            if (this.d != null) {
                if (w02 == this.R && w03 == this.S) {
                    return;
                }
                this.R = w02;
                this.S = w03;
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
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
