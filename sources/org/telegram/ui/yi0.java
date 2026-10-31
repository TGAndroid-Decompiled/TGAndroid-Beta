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
public final class yi0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.ui.Components.nj, org.telegram.messenger.us {
    public int D;
    public int E;
    public int F;
    public wi0 G;
    public boolean H;
    public final SparseArray I;
    public org.telegram.ui.Components.sn J;
    public long K;
    public int L;
    public wi0 M;
    public org.telegram.ui.Components.bi N;
    public Ringtone O;
    public long P;
    public int Q;
    public int R;
    public final ArrayList f43846a;
    public final ArrayList f43847b;
    public final ArrayList f43848c;
    public org.telegram.ui.Components.tk0 d;
    public kg.f e;
    public final org.telegram.ui.ActionBar.p6 f43849f;
    public int h;
    public int f43850n;
    public int f43851r;
    public int f43852s;
    public int f43853w;
    public int f43854x;
    public int f43855y;

    public yi0(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.f43846a = new ArrayList();
        this.f43847b = new ArrayList();
        this.f43848c = new ArrayList();
        this.F = 100;
        this.I = new SparseArray();
        this.L = -1;
        this.P = 0L;
        this.f43849f = p6Var;
    }

    public static void Y(org.telegram.ui.yi0 r10, android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yi0.Y(org.telegram.ui.yi0, android.content.Context, android.view.View, int):void");
    }

    public static void a0(yi0 yi0Var) {
        yi0Var.I.clear();
        kg.f fVar = yi0Var.e;
        fVar.k(0, ((yi0) fVar.d).h);
        yi0Var.g0();
    }

    public static void e0(View view, int i10, int i11) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i12 = 0; i12 < i2Var.getChildCount(); i12++) {
                View childAt = i2Var.getChildAt(i12);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.eq) {
                        org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) imageView.getDrawable();
                        Drawable drawable = eqVar.f25839a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = eqVar.f25840b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String f0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return org.telegram.messenger.cd.a0("SoundNameEmpty", null, 2131745296, org.telegram.messenger.cd.u(document.date, true));
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vi0(this, context));
        if (this.K == 0) {
            int i10 = this.L;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747884, null));
            } else if (i10 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747885, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747886, null));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747882, null));
            } else if (i10 == 5 || i10 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747883, null));
            }
        } else {
            this.J = new org.telegram.ui.Components.sn(context, null, false, this.f43849f);
            if (this.K < 0) {
                if (this.P != 0) {
                    TLRPC.TL_forumTopic f7 = getMessagesController().f18891r7.f(-this.K, this.P);
                    gg.e.p(this.J.getAvatarImageView(), f7, false, true, this.f43849f);
                    this.simpleActionBar.setTitle(f7.title);
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.K));
                    this.J.setChatAvatar(L0);
                    this.simpleActionBar.setTitle(L0.title);
                }
            } else {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.K));
                if (Z1 != null) {
                    this.J.setUserAvatar(Z1);
                    this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.cd.L0(2131747887, null));
            org.telegram.messenger.i0.E2(this.J.e);
            this.simpleActionBar.addView(this.J.e, w7.b6.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.d(2, 2131232164, org.telegram.messenger.cd.L0(2131745477, null), org.telegram.messenger.i0.L(54.0f));
        l4.d(1, 2131232107, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.d = tk0Var;
        tk0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        kg.f fVar = new kg.f(this, 7);
        this.e = fVar;
        fVar.C(true);
        this.d.setAdapter(this.e);
        ((s4.j) this.d.getItemAnimator()).f47927m = false;
        ((s4.j) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new s4.a0());
        this.d.setOnItemClickListener(new mg.q0(19, this, context));
        this.d.setOnItemLongClickListener(new tt(this, 27));
        getMediaDataController().f18362z0.g(false);
        this.f43846a.clear();
        this.f43847b.clear();
        for (int i11 = 0; i11 < getMediaDataController().f18362z0.e.size(); i11++) {
            of.b bVar = (of.b) getMediaDataController().f18362z0.e.get(i11);
            ?? obj = new Object();
            int i12 = this.F;
            this.F = i12 + 1;
            obj.f43320c = i12;
            obj.f43318a = true;
            obj.d = bVar.f14155c;
            TLRPC.Document document3 = bVar.f14153a;
            String str = document3.file_name_fixed;
            obj.f43321f = str;
            obj.e = document3;
            obj.f43321f = f0(document3, str);
            obj.f43322g = bVar.f14154b;
            wi0 wi0Var = this.M;
            if (wi0Var != null && (document = wi0Var.e) != null && (document2 = bVar.f14153a) != null && document.f19799id == document2.f19799id) {
                this.M = null;
                this.G = obj;
            }
            this.f43846a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.w0.f19025b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.F;
        this.F = i13 + 1;
        obj2.f43320c = i13;
        obj2.f43321f = org.telegram.messenger.cd.L0(2131748167, null);
        this.f43847b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.F;
        this.F = i14 + 1;
        obj3.f43320c = i14;
        obj3.f43321f = org.telegram.messenger.cd.L0(2131751600, null);
        obj3.f43319b = true;
        this.f43847b.add(obj3);
        wi0 wi0Var2 = this.M;
        if (wi0Var2 != null && wi0Var2.e == null && wi0Var2.f43322g.equals("NoSound")) {
            this.M = null;
            this.G = obj2;
        }
        wi0 wi0Var3 = this.M;
        if (wi0Var3 != null && wi0Var3.e == null && wi0Var3.f43322g.equals("Default")) {
            this.M = null;
            this.G = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.F;
            this.F = i15 + 1;
            obj4.f43320c = i15;
            obj4.f43321f = string;
            obj4.f43322g = str2;
            wi0 wi0Var4 = this.M;
            if (wi0Var4 != null && wi0Var4.e == null && wi0Var4.f43322g.equals(str2)) {
                this.M = null;
                this.G = obj4;
            }
            this.f43847b.add(obj4);
        }
        if (getMediaDataController().f18362z0.f14161f && this.G == null) {
            this.G = obj3;
            this.H = true;
        }
        h0();
        h0();
        return this.fragmentView;
    }

    public final void d0(wi0 wi0Var) {
        int i10 = wi0Var.f43320c;
        SparseArray sparseArray = this.I;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(wi0Var.f43320c);
        } else if (wi0Var.f43318a) {
            sparseArray.put(wi0Var.f43320c, wi0Var);
        } else {
            return;
        }
        g0();
        kg.f fVar = this.e;
        fVar.k(0, ((yi0) fVar.d).h);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i10 == org.telegram.messenger.zs.f19607e5) {
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.f43846a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((wi0) arrayList.get(i12)).d), (wi0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().f18362z0.e.size(); i13++) {
                of.b bVar = (of.b) getMediaDataController().f18362z0.e.get(i13);
                ?? obj = new Object();
                wi0 wi0Var = (wi0) hashMap.get(Integer.valueOf(bVar.f14155c));
                if (wi0Var != null) {
                    if (wi0Var == this.G) {
                        this.G = obj;
                    }
                    obj.f43320c = wi0Var.f43320c;
                } else {
                    int i14 = this.F;
                    this.F = i14 + 1;
                    obj.f43320c = i14;
                }
                obj.f43318a = true;
                obj.d = bVar.f14155c;
                TLRPC.Document document3 = bVar.f14153a;
                if (document3 != null) {
                    obj.f43321f = document3.file_name_fixed;
                } else {
                    obj.f43321f = new File(bVar.f14154b).getName();
                }
                TLRPC.Document document4 = bVar.f14153a;
                obj.e = document4;
                obj.f43321f = f0(document4, obj.f43321f);
                obj.f43322g = bVar.f14154b;
                wi0 wi0Var2 = this.M;
                if (wi0Var2 != null && (document = wi0Var2.e) != null && (document2 = bVar.f14153a) != null && document.f19799id == document2.f19799id) {
                    this.M = null;
                    this.G = obj;
                }
                arrayList.add(obj);
            }
            h0();
            this.e.f();
            if (getMediaDataController().f18362z0.f14161f && this.G == null) {
                ArrayList arrayList2 = this.f43847b;
                if (arrayList2.size() > 0) {
                    this.M = null;
                    this.G = (wi0) arrayList2.get(0);
                }
            }
        }
    }

    public final void g0() {
        SparseArray sparseArray = this.I;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.y(sparseArray.size(), this.simpleActionBar.s());
            this.simpleActionBar.C();
            return;
        }
        this.simpleActionBar.r();
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f43849f;
    }

    public final void h0() {
        this.f43850n = -1;
        this.f43851r = -1;
        this.f43852s = -1;
        this.f43853w = -1;
        this.f43855y = -1;
        this.D = -1;
        this.E = -1;
        this.h = 1;
        ArrayList arrayList = this.f43846a;
        if (!arrayList.isEmpty()) {
            int i10 = this.h;
            this.f43850n = i10;
            int size = arrayList.size() + i10;
            this.h = size;
            this.f43851r = size;
        }
        int i11 = this.h;
        this.f43852s = i11;
        this.h = i11 + 2;
        this.f43853w = i11 + 1;
        ArrayList arrayList2 = this.f43847b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.h;
            int i13 = i12 + 1;
            this.h = i13;
            this.f43855y = i12;
            this.D = i13;
            int size2 = arrayList2.size() + i13;
            this.h = size2;
            this.E = size2;
        }
        int i14 = this.h;
        this.h = i14 + 1;
        this.f43854x = i14;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().l2((String) arrayList.get(i11));
        }
        getNotificationCenter().k(org.telegram.messenger.zs.f19607e5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 21 && intent != null && this.N != null) {
            Uri data = intent.getData();
            int i12 = org.telegram.messenger.zs.f19607e5;
            boolean z10 = true;
            boolean z11 = false;
            if (data != null) {
                String T0 = org.telegram.messenger.i0.T0(intent.getData());
                if (T0 != null) {
                    if (T0.startsWith("content://")) {
                        T0 = MediaController.t(-1L, intent.getData(), "mp3");
                    }
                    if (this.N.f24676g2.P(new File(T0))) {
                        getMediaDataController().l2(T0);
                        getNotificationCenter().k(i12, new Object[0]);
                        z11 = z10;
                    }
                }
                z10 = false;
                z11 = z10;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z12 = false;
                for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                    Uri uri = clipData.getItemAt(i13).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.t(-1L, uri, "mp3");
                    }
                    if (this.N.f24676g2.P(new File(uri2))) {
                        getMediaDataController().l2(uri2);
                        getNotificationCenter().k(i12, new Object[0]);
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
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
        long j10 = this.K;
        if (j10 != 0) {
            String v = org.telegram.messenger.ot.v(j10, this.P, false);
            str2 = sc.e.h("sound_document_id_", v);
            str = sc.e.h("sound_path_", v);
        } else {
            int i10 = this.L;
            if (i10 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i10 != 4 && i10 != 5) {
                throw new RuntimeException("Unsupported type");
            } else {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.M = obj;
        if (j11 != 0) {
            obj.e = new TLRPC.TL_document();
            this.M.e.f19799id = j11;
        } else {
            obj.f43322g = string;
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
                str = "sound_" + org.telegram.messenger.ot.v(this.K, this.P, false);
                str2 = "sound_path_" + org.telegram.messenger.ot.v(this.K, this.P, false);
                str3 = "sound_document_id_" + org.telegram.messenger.ot.v(this.K, this.P, false);
                edit.putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(this.K, this.P, false), true);
            } else {
                int i10 = this.L;
                if (i10 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i10 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i10 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i10 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            wi0 wi0Var = this.G;
            if (wi0Var.f43318a && (document = wi0Var.e) != null) {
                edit.putLong(str3, document.f19799id);
                edit.putString(str, this.G.f43321f);
                edit.putString(str2, "NoSound");
            } else if (wi0Var.f43322g != null) {
                edit.putString(str, wi0Var.f43321f);
                edit.putString(str2, this.G.f43322g);
                edit.remove(str3);
            } else if (wi0Var.f43319b) {
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
            getNotificationCenter().k(org.telegram.messenger.zs.f19608f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19607e5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19607e5);
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f43849f;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.N6, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21059k7, p6Var);
            if (this.d != null) {
                if (w02 == this.Q && w03 == this.R) {
                    return;
                }
                this.Q = w02;
                this.R = w03;
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    e0(this.d.getChildAt(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getCachedChildCount(); i11++) {
                    e0(this.d.P(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getHiddenChildCount(); i12++) {
                    e0(this.d.V(i12), w02, w03);
                }
                for (int i13 = 0; i13 < this.d.getAttachedScrapChildCount(); i13++) {
                    e0(this.d.O(i13), w02, w03);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
