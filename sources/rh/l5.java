package rh;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bg;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.t90;
import org.telegram.ui.px0;
public final class l5 implements Runnable {
    public final int f47182a;
    public final Object f47183b;
    public final Object f47184c;
    public final Object d;

    public l5(Object obj, Object obj2, Object obj3, int i10) {
        this.f47182a = i10;
        this.f47183b = obj;
        this.d = obj2;
        this.f47184c = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        ?? r72;
        sg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        org.telegram.ui.Components.f5 f5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        jj jjVar;
        int f12;
        int[] iArr;
        File file;
        int i10;
        boolean contains;
        int i11;
        boolean z17;
        ConcurrentHashMap concurrentHashMap;
        SQLiteCursor sQLiteCursor;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15 = this.f47182a;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        boolean z18 = true;
        ?? r82 = 0;
        boolean z19 = false;
        Object obj = this.d;
        Object obj2 = this.f47184c;
        Object obj3 = this.f47183b;
        switch (i15) {
            case 0:
                e6 e6Var = (e6) obj3;
                TLObject tLObject = (TLObject) obj;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList2 = e6Var.v;
                boolean[] zArr = e6Var.f46863r;
                ArrayList[] arrayListArr = e6Var.f46862q;
                int i16 = e6Var.f46849a;
                boolean z20 = !e6Var.e;
                e6Var.f46851c = System.currentTimeMillis();
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    vp.r1(i16).V3(starsStatus.users, false);
                    vp.r1(i16).P3(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList3 = starsStatus.history;
                        int size = arrayList3.size();
                        int i17 = 0;
                        while (i17 < size) {
                            TL_stars.StarsTransaction starsTransaction = arrayList3.get(i17);
                            i17++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            boolean z21 = z18;
                            arrayListArr[r82].add(starsTransaction2);
                            boolean z22 = r82;
                            TL_stars.StarsStatus starsStatus2 = starsStatus;
                            if (starsTransaction2.amount.amount > 0) {
                                r72 = z21;
                            } else {
                                r72 = 2;
                            }
                            arrayListArr[r72].add(starsTransaction2);
                            z18 = z21;
                            r82 = z22 ? 1 : 0;
                            starsStatus = starsStatus2;
                        }
                        z10 = z18;
                        z13 = r82;
                        int i18 = z13;
                        while (true) {
                            TL_stars.StarsStatus starsStatus3 = starsStatus;
                            if (i18 < 3) {
                                if (arrayListArr[i18].isEmpty() && !zArr[i18]) {
                                    z15 = z13;
                                } else {
                                    z15 = z10;
                                }
                                zArr[i18] = z15;
                                boolean[] zArr2 = e6Var.f46866u;
                                starsStatus = starsStatus3;
                                if ((starsStatus.flags & 1) == 0) {
                                    z16 = z10;
                                } else {
                                    z16 = z13;
                                }
                                zArr2[i18] = z16;
                                if (z16) {
                                    e6Var.f46865t[i18] = z13;
                                }
                                String[] strArr = e6Var.f46864s;
                                if (zArr2[i18]) {
                                    str = null;
                                } else {
                                    str = starsStatus.next_offset;
                                }
                                strArr[i18] = str;
                                i18++;
                            } else {
                                starsStatus = starsStatus3;
                                z11 = z10;
                            }
                        }
                    } else {
                        z10 = true;
                        z13 = false;
                        z11 = false;
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(starsStatus.subscriptions);
                        e6Var.f46868x = z13;
                        e6Var.f46867w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z14 = z10;
                        } else {
                            z14 = false;
                        }
                        e6Var.f46869y = z14;
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                    long j10 = e6Var.f46852f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z20 = z10;
                    }
                    e6Var.f46852f = starsAmount;
                    e6Var.f46853g = 0L;
                } else {
                    z10 = true;
                    z11 = false;
                    z12 = false;
                }
                e6Var.d = false;
                e6Var.e = z10;
                if (z20) {
                    zs.f(i16).k(221, new Object[0]);
                }
                if (z11) {
                    zs.f(i16).k(222, new Object[0]);
                }
                if (z12) {
                    zs.f(i16).k(223, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                e6 e6Var2 = (e6) obj3;
                Runnable runnable2 = (Runnable) obj2;
                e6Var2.getClass();
                Iterator it = ((HashSet) obj).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    e6Var2.Q.remove(num);
                    e6Var2.R.remove(num);
                }
                runnable2.run();
                return;
            case 2:
                ((boolean[]) obj3)[0] = false;
                org.telegram.messenger.i0.v1((EditTextBoldCursor) obj);
                ((org.telegram.ui.ActionBar.z2[]) obj2)[0].dismiss();
                return;
            case 3:
                th.f2 f2Var = (th.f2) obj3;
                sg.o0 o0Var = (sg.o0) obj;
                View view = (View) obj2;
                th.z2 z2Var = f2Var.f48950a;
                z2Var.f49701d3 = true;
                th.y2 y2Var = z2Var.f49776x1;
                ImageReceiver imageReceiver = z2Var.U2;
                boolean[] zArr3 = {false};
                th.j5 j5Var = z2Var.f49735n0;
                j5Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.messenger.x(2, j5Var)).setDuration(150L).start();
                int L = org.telegram.messenger.i0.L(8.0f);
                th.j5 j5Var2 = new th.j5(z2Var.getContext(), z2Var.f49710g1);
                z2Var.f49735n0 = j5Var2;
                j5Var2.setPadding(L, L, L, L);
                z2Var.m0.addView(z2Var.f49735n0, w7.b6.e(40, 40, 3));
                org.telegram.ui.Components.f5 f5Var2 = z2Var.X2;
                if (f5Var2 != null) {
                    f5Var2.n(z2Var);
                    dVar = null;
                    z2Var.X2 = null;
                } else {
                    dVar = null;
                }
                sg.d dVar2 = z2Var.V2;
                if (dVar2 != null) {
                    dVar2.d(z2Var);
                    z2Var.V2 = dVar;
                }
                z2Var.Y2 = false;
                if (o0Var.f48435g != 0) {
                    z2Var.Y2 = true;
                    org.telegram.ui.Components.f5 f5Var3 = new org.telegram.ui.Components.f5(2, z2Var.f49730l2, o0Var.f48435g);
                    z2Var.X2 = f5Var3;
                    f5Var3.a(z2Var);
                } else if (o0Var.f48434f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(z2Var.f49730l2).f18341r.get(o0Var.f48434f)) != null) {
                    z2Var.W2.u0(null, null, ic.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.q0(ic.b(tL_availableReaction.around_animation), sg.k0.a(), null, null, null, 0);
                    if (imageReceiver.B() != null) {
                        imageReceiver.B().N(0, false, true);
                    }
                }
                z2Var.f49735n0.setReaction(o0Var);
                if (z2Var.f49732m1) {
                    TL_stories.StoryItem storyItem3 = y2Var.f49661a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = y2Var.f49661a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        sg.q0.b(null, storyItem4.sent_reaction, storyViews);
                        z2Var.i1(true);
                    }
                }
                if (o0Var.f48435g != 0 && (f5Var = z2Var.f49735n0.f49108f) != null) {
                    sg.d a2 = sg.d.a(f5Var, false, true);
                    z2Var.V2 = a2;
                    a2.f(z2Var);
                }
                z2Var.B1.j0(z2Var.f49726k1, y2Var.f49661a, o0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                z2Var.getLocationInWindow(iArr4);
                z2Var.f49708f3 = iArr3[0] - iArr4[0];
                z2Var.f49712g3 = iArr3[1] - iArr4[1];
                z2Var.f49716h3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z2Var.f49704e3 = 0.0f;
                z2Var.invalidate();
                th.j5 j5Var3 = z2Var.f49735n0;
                j5Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = j5Var3.e;
                if (o0Var.f48435g == 0 && (tL_availableReaction2 = (TLRPC.TL_availableReaction) ui.b0(d20.f15147s0).f18341r.get(o0Var.f48434f)) != null) {
                    imageReceiver2.q0(ic.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.W(0);
                }
                ofFloat.addUpdateListener(new ci.b(f2Var, ofFloat, zArr3, 2));
                ofFloat.addListener(new org.telegram.ui.ActionBar.g1(f2Var, zArr3, j5Var3, 11));
                ofFloat.setDuration(220L);
                ofFloat.start();
                z2Var.Z0(false);
                return;
            case 4:
                th.u2 u2Var = (th.u2) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                th.z2 z2Var2 = u2Var.f49512x;
                org.telegram.ui.Components.s4.R(z2Var2.getContext(), null, p6Var, new q5.a(u2Var, (TL_stories.StoryItem) obj2, p6Var, 5));
                th.u2 u2Var2 = z2Var2.f49696c1;
                if (u2Var2 != null) {
                    u2Var2.a();
                    return;
                }
                return;
            case 5:
                th.q4 q4Var = (th.q4) obj3;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) obj;
                q20 q20Var = (q20) obj2;
                for (int i19 = 0; i19 < q4Var.f49636i.size(); i19++) {
                    jj jjVar2 = (jj) q4Var.f49636i.get(i19);
                    if (jjVar2 != null && (storyItem = jjVar2.f16341l) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f19799id == document.f19799id) {
                        q20Var.a(document2);
                        return;
                    }
                }
                q20Var.a(null);
                return;
            case 6:
                th.e5 e5Var = (th.e5) obj3;
                TLObject tLObject2 = (TLObject) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i20 = e5Var.f48904a;
                e5Var.R = true;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    e5Var.S = null;
                    zs.f(i20).k(197, new Object[0]);
                    return;
                } else if (tLObject2 instanceof TL_stories.canSendStoryCount) {
                    e5Var.S = new j4.w(1, ((TL_stories.canSendStoryCount) tLObject2).count_remains, -1L);
                    zs.f(i20).k(197, new Object[0]);
                    return;
                } else {
                    e5Var.n(tL_error);
                    return;
                }
            case 7:
                th.p4 p4Var = (th.p4) obj;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj2;
                ArrayList arrayList4 = ((th.q4) obj3).f49636i;
                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                    jj jjVar3 = (jj) arrayList4.get(i21);
                    if (jjVar3 != null && (storyItem2 = jjVar3.f16341l) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = p4Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f19799id == document3.f19799id) {
                                g3Var.a((th.p4) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f19817id == photo2.f19817id) {
                            g3Var.a((th.p4) storyItem2);
                            return;
                        }
                    }
                }
                g3Var.a(null);
                return;
            case 8:
                th.q4 q4Var2 = (th.q4) obj3;
                TLObject tLObject3 = (TLObject) obj;
                Runnable runnable3 = (Runnable) obj2;
                th.u4 u4Var = q4Var2.f49644q;
                ArrayList arrayList5 = q4Var2.G;
                ArrayList arrayList6 = q4Var2.f49636i;
                ArrayList arrayList7 = q4Var2.H;
                q4Var2.F = 0;
                q4Var2.C = false;
                q4Var2.D = true;
                q4Var2.f49645r = true;
                ArrayList arrayList8 = new ArrayList();
                if (tLObject3 instanceof Vector) {
                    ArrayList arrayList9 = ((Vector) tLObject3).objects;
                    int size2 = arrayList9.size();
                    int i22 = 0;
                    while (i22 < size2) {
                        Object obj4 = arrayList9.get(i22);
                        i22++;
                        arrayList8.add((TL_bots.botPreviewMedia) obj4);
                    }
                } else if (tLObject3 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject3;
                    arrayList5.clear();
                    arrayList5.addAll(previewinfo.lang_codes);
                    arrayList8.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList10 = new ArrayList(arrayList6);
                arrayList6.clear();
                arrayList7.clear();
                int size3 = arrayList8.size();
                int i23 = 0;
                while (i23 < size3) {
                    Object obj5 = arrayList8.get(i23);
                    i23++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj5;
                    int i24 = size3;
                    jj jjVar4 = new jj(q4Var2.f49633c, new th.p4(q4Var2, q4Var2.d, botpreviewmedia));
                    int i25 = 0;
                    while (true) {
                        if (i25 < arrayList10.size()) {
                            if (vp.t0(((jj) arrayList10.get(i25)).f16341l.media, botpreviewmedia.media)) {
                                jjVar = (jj) arrayList10.get(i25);
                            } else {
                                i25++;
                            }
                        } else {
                            jjVar = null;
                        }
                    }
                    TLRPC.Message message = jjVar4.f16337k;
                    if (jjVar == null) {
                        f12 = q4Var2.I;
                        q4Var2.I = f12 + 1;
                    } else {
                        f12 = jjVar.f1();
                    }
                    message.f19814id = f12;
                    jjVar4.f16341l.f20031id = f12;
                    jjVar4.f16333j = q4Var2;
                    jjVar4.r0(false);
                    if (arrayList7.isEmpty()) {
                        arrayList7.add(new ArrayList());
                    }
                    ((ArrayList) arrayList7.get(0)).add(Integer.valueOf(jjVar4.f1()));
                    arrayList6.add(jjVar4);
                    size3 = i24;
                }
                org.telegram.messenger.i0.r(u4Var);
                org.telegram.messenger.i0.g3(u4Var);
                if (runnable3 != null) {
                    org.telegram.messenger.i0.g3(runnable3);
                    return;
                }
                return;
            case 9:
                th.o7 o7Var = ((th.f7) obj3).d;
                o7Var.f49319n0.D(o7Var.h, ((th.x4) obj).d, (ArrayList) obj2);
                return;
            case 10:
                th.x7 x7Var = (th.x7) obj3;
                TLObject tLObject4 = (TLObject) obj;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj2;
                sg.v vVar = x7Var.f49659f;
                int i26 = x7Var.f49657b;
                th.x7.f49655g = System.currentTimeMillis();
                if (tLObject4 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject4;
                    vp.r1(i26).V3(tL_stories_storyViews.users, false);
                    if (!x7Var.d(tL_stories_getStoriesViews.f20039id, tL_stories_storyViews)) {
                        x7Var.d = 0;
                        x7Var.e = false;
                        return;
                    }
                    zs.f(i26).k(324, new Object[0]);
                }
                x7Var.d = 0;
                if (x7Var.e) {
                    org.telegram.messenger.i0.r(vVar);
                    org.telegram.messenger.i0.h3(vVar, 10000L);
                    return;
                }
                return;
            case 11:
                vh.k1 k1Var = (vh.k1) obj3;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList11 = k1Var.f51376w;
                vh.l1 l1Var = k1Var.N;
                ArrayList arrayList12 = k1Var.f51375s;
                if (TextUtils.equals((String) obj2, k1Var.H)) {
                    k1Var.f51378y = 0;
                    arrayList12.clear();
                    arrayList11.clear();
                    k1Var.D.clear();
                    k1Var.f51373n.clear();
                    k1Var.f51378y++;
                    arrayList12.add(null);
                    arrayList11.add(0L);
                    if (tLObject5 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        arrayList12.addAll(tL_messages_stickers.stickers);
                        k1Var.f51378y = tL_messages_stickers.stickers.size() + k1Var.f51378y;
                    }
                    k1Var.I = k1Var.H;
                    k1Var.f();
                    vh.b1.z1(l1Var.f51445b, 0, 0);
                    l1Var.f51447f.c(false);
                    l1Var.e.n(false);
                    return;
                }
                return;
            case 12:
                vh.h2 h2Var = (vh.h2) obj3;
                String str2 = (String) obj2;
                float f7 = h2Var.K;
                if (obj != null) {
                    int min = (int) Math.min(org.telegram.messenger.i0.f16026q.x / 3.0f, org.telegram.messenger.i0.L(330.0f));
                    if (obj instanceof ef) {
                        ef efVar = (ef) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        h2Var.c(efVar, options);
                        vh.n5.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = h2Var.c(efVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f7) {
                            if (efVar.T == 0 && efVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = w7.l8.b(c10, true);
                                efVar.T = iArr2[0];
                                efVar.U = iArr2[1];
                            } else {
                                int i27 = efVar.T;
                                if (i27 != 0 && (i10 = efVar.U) != 0) {
                                    iArr2 = new int[]{i27, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if ((obj instanceof vh.n5) && (file = ((vh.n5) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        vh.n5.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.i0.g3(new l5(h2Var, str2, pair, 13));
                return;
            case 13:
                vh.h2 h2Var2 = (vh.h2) obj3;
                String str3 = (String) obj;
                Pair pair2 = (Pair) obj2;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr5 = (int[]) pair2.second;
                Paint paint = h2Var2.d;
                if (bitmap != null) {
                    if (str3 != null) {
                        vh.h2.f51229f0.put(str3, bitmap);
                        HashMap hashMap = vh.h2.f51228e0;
                        Integer num2 = (Integer) hashMap.get(str3);
                        if (num2 != null) {
                            hashMap.put(str3, Integer.valueOf(num2.intValue() + 1));
                        } else {
                            hashMap.put(str3, 1);
                        }
                    }
                    if (!TextUtils.equals(str3, h2Var2.R)) {
                        vh.h2.d(str3);
                        return;
                    }
                    h2Var2.f51230a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        h2Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        h2Var2.e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    h2Var2.h();
                    h2Var2.invalidate();
                    return;
                }
                return;
            case 14:
                vh.j2 j2Var = (vh.j2) obj3;
                TLObject tLObject6 = (TLObject) obj;
                vp vpVar = (vp) obj2;
                j2Var.f51307r = true;
                j2Var.d = false;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    vpVar.V3(tL_contacts_resolvedPeer.users, false);
                    vpVar.P3(tL_contacts_resolvedPeer.chats, false);
                    hs.a0(j2Var.f51310x.f51380a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    j2Var.E();
                    return;
                }
                return;
            case 15:
                String[] strArr2 = (String[]) obj3;
                int[][] iArr6 = (int[][]) obj;
                px0 px0Var = (px0) obj2;
                for (int i28 = 0; i28 < strArr2.length; i28++) {
                    String str4 = strArr2[i28];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr6[i28], 0L);
                    }
                }
                org.telegram.messenger.i0.g3(px0Var);
                return;
            case 16:
                AnimatedFileNative.d((String) obj3, ((int[][]) obj)[0], 0L);
                org.telegram.messenger.i0.g3((px0) obj2);
                return;
            case 17:
                vh.r6 r6Var = (vh.r6) obj3;
                TLObject tLObject7 = (TLObject) obj;
                vp vpVar2 = (vp) obj2;
                vh.w6 w6Var = r6Var.W;
                r6Var.f51893w.setLoading(false);
                if (tLObject7 != null) {
                    int i29 = vh.w6.U1;
                    ArrayList O0 = w6Var.O0();
                    for (int i30 = 0; i30 < O0.size(); i30++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i30);
                        if (user != null && (contains = r6Var.f51888c.contains(Long.valueOf(user.f19942id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i11 = user.flags2 | 4;
                            } else {
                                i11 = user.flags2 & (-5);
                            }
                            user.flags2 = i11;
                            vpVar2.U3(user, false, false);
                        }
                    }
                }
                w6Var.M0();
                if (w6Var.Q1) {
                    w6Var.N0(new vh.u6(1, w6Var.f21583a, (ArrayList) null), new th.r2(w6Var, 1), false);
                    return;
                }
                w6Var.M0();
                w6Var.f52100i1.E(0);
                return;
            case 18:
                ((vh.n5) obj).O0 = (File) obj2;
                vh.k7 k7Var = ((vh.o8) obj3).f51616d1;
                if (k7Var != null) {
                    k7Var.f52192b.f30819f3.O(false);
                    return;
                }
                return;
            case 19:
                vh.o8 o8Var = (vh.o8) obj3;
                Bitmap bitmap2 = (Bitmap) obj;
                Runnable runnable4 = (Runnable) obj2;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), o8Var.B0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                org.telegram.messenger.i0.g3(runnable4);
                return;
            case 20:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    ((Task) ((pb.d) obj3).call()).continueWith((Executor) obj, new x9.w(2, taskCompletionSource));
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 21:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                try {
                    ((xa.f) obj3).b((Intent) obj);
                    return;
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            case 22:
                ArrayList arrayList13 = (ArrayList) obj3;
                HashMap hashMap2 = (HashMap) obj;
                q20 q20Var2 = (q20) obj2;
                ArrayList arrayList14 = new ArrayList();
                for (int i31 = 0; i31 < arrayList13.size(); i31++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList13.get(i31);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f19942id));
                    if (bool != null && bool.booleanValue()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    ?? obj6 = new Object();
                    obj6.f53863a = user2;
                    obj6.f53864b = z17;
                    arrayList14.add(obj6);
                }
                q20Var2.a(arrayList14);
                return;
            case 23:
                xh.h1 h1Var = (xh.h1) obj2;
                ((boolean[]) obj3)[0] = false;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    h1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 24:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                xh.m2 m2Var = ((xh.h2) obj3).d;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    xh.e2 e2Var = m2Var.D;
                    e2Var.getClass();
                    e2Var.x("emoji_status_access_requested", org.telegram.ui.web.z0.A("cancelled", "status"));
                    return;
                }
                new cc(m2Var.f53894q0, m2Var.F).Y(tL_error2).k(true);
                return;
            case 25:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                org.telegram.messenger.i0.g(connectedbotstarref.url);
                cc.a0((xh.z2) obj3).I(2131623993, cd.L0(2131754333, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131754334, xh.i.I0(connectedbotstarref.commission_permille), h20.p((TLRPC.User) obj2)))).j();
                return;
            case 26:
                xh.z2.C0((xh.z2) obj3, (TLObject) obj, (org.telegram.ui.ActionBar.x1) obj2);
                return;
            case 27:
                bg bgVar = (bg) obj2;
                int i32 = ((zf.z) obj3).f55704s0;
                vp r12 = vp.r1(i32);
                Iterator it2 = ((HashSet) obj).iterator();
                while (it2.hasNext()) {
                    Pair pair3 = (Pair) it2.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l4 = (Long) pair3.second;
                    long longValue = l4.longValue();
                    if (booleanValue) {
                        concurrentHashMap = r12.P;
                    } else {
                        concurrentHashMap = r12.O;
                    }
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    hs a02 = hs.a0(i32);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.f15940b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        i12 = sQLiteCursor.intValue(0);
                                        sQLiteCursor.dispose();
                                    }
                                    i12 = 0;
                                    sQLiteCursor.dispose();
                                } catch (Exception e7) {
                                    e = e7;
                                    a02.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i12 = 0;
                                    concurrentHashMap2.put(l4, Integer.valueOf(i12));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        sQLiteCursor = a02.f15940b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                        if (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(0);
                            int intValue2 = sQLiteCursor.intValue(1);
                            if (intValue2 <= intValue) {
                                i12 = intValue2;
                                sQLiteCursor.dispose();
                            }
                        }
                        i12 = 0;
                        sQLiteCursor.dispose();
                    }
                    concurrentHashMap2.put(l4, Integer.valueOf(i12));
                }
                org.telegram.messenger.i0.g3(bgVar);
                return;
            case 28:
                ((zf.x) obj3).a((a0.h) obj2, (ArrayList) obj);
                return;
            default:
                zf.x0 x0Var = (zf.x0) obj3;
                String str5 = (String) obj2;
                TLObject tLObject8 = (TLObject) obj;
                x0Var.E0 = 0;
                if (str5.equals(x0Var.D0) && (tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject8;
                    ArrayList arrayList15 = x0Var.A0;
                    if (arrayList15 != null) {
                        i13 = arrayList15.size();
                    } else {
                        i13 = 0;
                    }
                    x0Var.F("sticker_search_".concat(str5), tL_messages_stickers2.stickers);
                    ArrayList arrayList16 = x0Var.A0;
                    if (arrayList16 != null) {
                        i14 = arrayList16.size();
                    } else {
                        i14 = 0;
                    }
                    if (!x0Var.f55661o0 && (arrayList = x0Var.A0) != null && !arrayList.isEmpty()) {
                        x0Var.H();
                        t90 t90Var = x0Var.V;
                        if (x0Var.K() > 0) {
                            z19 = true;
                        }
                        t90Var.a(z19);
                        x0Var.f55661o0 = true;
                    }
                    if (i13 != i14) {
                        x0Var.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public l5(s4.g0 g0Var, String str, TLObject tLObject, int i10) {
        this.f47182a = i10;
        this.f47183b = g0Var;
        this.f47184c = str;
        this.d = tLObject;
    }
}
