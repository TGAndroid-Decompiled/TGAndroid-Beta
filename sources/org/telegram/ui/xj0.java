package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
public final class xj0 extends org.telegram.ui.ActionBar.r2 implements og0, NotificationCenter.NotificationCenterDelegate, rh.d {
    public fi.d E;
    public Boolean F;
    public tj0 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public ValueAnimator L;
    public float M;
    public String N;
    public qj0 O;
    public hh.c f45780a;
    public final vj0[] f45781b;
    public final ArrayList f45782c;
    public final HashSet d;
    public final HashSet e;
    public boolean f45783f;
    public boolean h;
    public boolean f45784n;
    public boolean f45785r;
    public boolean f45786s;
    public fi.h1 v;
    public wj0 f45787w;
    public int f45788x;
    public di.i4 f45789y;

    public xj0() {
        super(null);
        this.f45781b = new vj0[]{new vj0(), new vj0(), new vj0()};
        this.f45782c = new ArrayList();
        this.d = new HashSet();
        this.e = new HashSet();
        this.N = "";
    }

    public static void V(xj0 xj0Var) {
        HashSet hashSet = xj0Var.d;
        if (!xj0Var.f45783f && !hashSet.isEmpty() && !hashSet.equals(xj0Var.e)) {
            xj0Var.f45783f = true;
            xj0Var.p0(true);
            TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = new TL_feed.TL_feed_setInterestCategories();
            tL_feed_setInterestCategories.category_ids.addAll(hashSet);
            xj0Var.getConnectionsManager().bindRequestToGuid(xj0Var.getConnectionsManager().sendRequest(tL_feed_setInterestCategories, new j10(15, xj0Var, tL_feed_setInterestCategories)), xj0Var.classGuid);
        }
    }

    public static void W(xj0 xj0Var, ImageView imageView) {
        if (xj0Var.H) {
            return;
        }
        org.telegram.ui.ActionBar.b6 titleTextView = xj0Var.actionBar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.addOnLayoutChangeListener(new sj0(titleTextView.getTranslationX(), titleTextView.getLeft()));
        }
        xj0Var.actionBar.setBackButtonDrawable(null);
        imageView.setAlpha(1.0f);
    }

    public static org.telegram.ui.ActionBar.k X(xj0 xj0Var) {
        return xj0Var.actionBar;
    }

    public static void Y(xj0 xj0Var, boolean z10) {
        boolean z11;
        float f7;
        wb0 wb0Var;
        if (xj0Var.H != z10) {
            xj0Var.H = z10;
            ImageView backButton = xj0Var.actionBar.getBackButton();
            if (backButton != null && backButton.getVisibility() != 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f10 = 0.0f;
            if (z10 && !z11) {
                org.telegram.ui.ActionBar.b6 titleTextView = xj0Var.actionBar.getTitleTextView();
                if (titleTextView != null) {
                    titleTextView.addOnLayoutChangeListener(new sj0(titleTextView.getTranslationX(), titleTextView.getLeft()));
                }
                xj0Var.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
                backButton = xj0Var.actionBar.getBackButton();
                backButton.setAlpha(0.0f);
            }
            if (backButton != null) {
                backButton.animate().cancel();
                ViewPropertyAnimator animate = backButton.animate();
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator duration = animate.alpha(f7).setDuration(150L);
                if (z10) {
                    wb0Var = null;
                } else {
                    wb0Var = new wb0(23, xj0Var, backButton);
                }
                duration.withEndAction(wb0Var).start();
            }
            ValueAnimator valueAnimator = xj0Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            xj0Var.f45787w.setVisibility(0);
            float f11 = xj0Var.M;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            xj0Var.L = ofFloat;
            ofFloat.addUpdateListener(new b3(xj0Var, 16));
            xj0Var.L.addListener(new i50(xj0Var, 5));
            xj0Var.L.setDuration(220L);
            xj0Var.L.setInterpolator(org.telegram.ui.Components.ds.h);
            xj0Var.L.start();
            if (!z10) {
                xj0Var.n0("");
            }
        }
    }

    public static void a0(xj0 xj0Var) {
        if (xj0Var.H && TextUtils.isEmpty(xj0Var.N)) {
            xj0Var.actionBar.g(true);
        }
    }

    public static org.telegram.ui.ActionBar.u6 b0(xj0 xj0Var) {
        return xj0Var.resourceProvider;
    }

    public static void d0(View view, boolean z10) {
        float f7;
        dh dhVar;
        view.animate().cancel();
        if (z10) {
            view.setVisibility(0);
        }
        ViewPropertyAnimator animate = view.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator interpolator = animate.alpha(f7).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.ds.h);
        if (z10) {
            dhVar = null;
        } else {
            dhVar = new dh(2, view);
        }
        interpolator.withEndAction(dhVar).start();
    }

    public static void e0(org.telegram.ui.Components.r71 r71Var) {
        if (r71Var == null) {
            return;
        }
        r71Var.getViewTreeObserver().addOnPreDrawListener(new i7(r71Var, 4));
        r71Var.invalidate();
    }

    public static void o0(vj0 vj0Var) {
        org.telegram.ui.Components.r71 r71Var = vj0Var.d;
        if (r71Var != null) {
            r71Var.f32150g3.O(true);
        }
    }

    @Override
    public final void D() {
        boolean z10 = this.I;
        vj0[] vj0VarArr = this.f45781b;
        if (z10) {
            e0(vj0VarArr[2].d);
            return;
        }
        fi.h1 h1Var = this.v;
        if (h1Var != null) {
            e0(vj0VarArr[h1Var.getCurrentPosition()].d);
        }
    }

    @Override
    public final void M() {
        int i10 = this.K;
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        p0(false);
    }

    @Override
    public final View O() {
        return this.fragmentView;
    }

    @Override
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        ValueAnimator valueAnimator;
        int[] iArr;
        int i10;
        if (!this.I) {
            fi.h1 h1Var = this.v;
            if (h1Var == null || ((valueAnimator = h1Var.S) != null && valueAnimator.isRunning())) {
                return false;
            }
            this.v.getLocationOnScreen(new int[2]);
            if (motionEvent.getRawY() >= iArr[1]) {
                fi.h1 h1Var2 = this.v;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                if (h1Var2.canScrollHorizontally(i10)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c0(vj0 vj0Var, TLRPC.Message message, int i10) {
        int i11 = 0;
        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.peer_id != null) {
            String str = MessageObject.getDialogId(message) + ":" + message.f22048id;
            HashSet hashSet = vj0Var.f44836b;
            ArrayList arrayList = vj0Var.f44835a;
            if (hashSet.add(str)) {
                MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
                if (vj0Var == this.f45781b[2]) {
                    messageObject.setQuery(this.N);
                }
                if (message.grouped_id != 0) {
                    long dialogId = messageObject.getDialogId();
                    long j10 = messageObject.messageOwner.grouped_id;
                    while (true) {
                        IdentityHashMap identityHashMap = vj0Var.f44837c;
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        Object obj = arrayList.get(i11);
                        if (obj instanceof MessageObject) {
                            MessageObject messageObject2 = (MessageObject) obj;
                            if (messageObject2.messageOwner.grouped_id == j10 && messageObject2.getDialogId() == dialogId) {
                                ArrayList arrayList2 = (ArrayList) identityHashMap.get(messageObject2);
                                if (arrayList2 == null) {
                                    arrayList2 = org.telegram.messenger.t.l(messageObject2);
                                }
                                arrayList2.add(messageObject);
                                Collections.sort(arrayList2, new bv(3));
                                if (TextUtils.isEmpty(messageObject2.messageOwner.message) && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    identityHashMap.remove(messageObject2);
                                    arrayList.set(i11, messageObject);
                                } else {
                                    messageObject = messageObject2;
                                }
                                identityHashMap.put(messageObject, arrayList2);
                                return true;
                            }
                        }
                        i11++;
                    }
                }
                if (i10 < 0) {
                    arrayList.add(messageObject);
                    return true;
                }
                arrayList.add(i10, messageObject);
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.NewsTitle));
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 15));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 15);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        k0 k0Var = new k0(this, context, 15);
        qt qtVar = new qt(this, 25);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(k0Var, qtVar);
        int i10 = org.telegram.ui.ActionBar.y6.f23354d6;
        org.telegram.ui.ActionBar.f7.i(i10, k0Var, getResourceProvider());
        this.fragmentView = k0Var;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35535h1.d.add(this);
        }
        fi.h1 h1Var = new fi.h1(this, context, 4);
        this.v = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.v.setAdapter(new bi.e5(this, context, 1));
        wj0 wj0Var = new wj0(this, context);
        this.f45787w = wj0Var;
        k0Var.addView(wj0Var, org.telegram.ui.Components.gb1.h(-1, 36.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.v, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 42.0f, 0.0f, -42.0f));
        tj0 tj0Var = new tj0(this, context);
        this.G = tj0Var;
        tj0Var.setImportantForAccessibility(2);
        k0Var.addView(this.G, org.telegram.ui.Components.gb1.h(-1, 12.0f, 48, 0.0f, 42.0f, 0.0f, 0.0f));
        vj0[] vj0VarArr = this.f45781b;
        vj0VarArr[2].d = h0(context, 2);
        vj0VarArr[2].d.setAlpha(0.0f);
        vj0VarArr[2].d.setVisibility(8);
        k0Var.addView(vj0VarArr[2].d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        hh.c cVar = new hh.c();
        this.f45780a = cVar;
        cVar.a(getThemedColor(i10));
        ch.b bVar = new ch.b(cVar);
        di.i4 i4Var = new di.i4(context);
        this.f45789y = i4Var;
        eh.d c10 = bVar.c(i4Var, new fh.b(i10, this.resourceProvider), false);
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(22.0f));
        this.f45789y.setBackground(c10);
        org.telegram.ui.Components.gb1.c(this.f45789y, 0.02f, 1.2f);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.E = dVar;
        dVar.setUseWrapContent(true);
        this.E.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.E.setRoundRadius(19);
        this.E.i(LocaleController.getString(R.string.NewsSaveInterests), false, true);
        this.E.setShowZero(true);
        this.E.setStateListAnimator(null);
        this.f45789y.addView(this.E, org.telegram.ui.Components.gb1.i(-2, -1, 17));
        this.f45789y.setOnClickListener(new x50(this, 12));
        k0Var.addView(this.f45789y, org.telegram.ui.Components.gb1.i(-2, 60, 81));
        p0(false);
        k0();
        setBulletinDelegate(new d9(this, 6));
        return k0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10 = true;
        if (i10 == NotificationCenter.channelNewsUpdated) {
            l0(1, true);
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            if (!((Boolean) objArr[2]).booleanValue() && ((Integer) objArr[3]).intValue() == 0 && longValue < 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-longValue));
                if (ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.isNotInChat(chat)) {
                    vj0 vj0Var = this.f45781b[1];
                    if (vj0Var.f44840i) {
                        if (!vj0Var.h || !vj0Var.f44844m) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            org.telegram.ui.Components.r71 r71Var = vj0Var.d;
                            if (r71Var == null || r71Var.canScrollVertically(-1)) {
                                z10 = false;
                            }
                            int size = arrayList.size();
                            int i12 = 0;
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                TLRPC.Message message = ((MessageObject) obj).messageOwner;
                                if (message != null && message.f22048id > 0 && !(message instanceof TLRPC.TL_messageService) && c0(vj0Var, message, 0)) {
                                    i12++;
                                }
                            }
                            if (i12 > 0) {
                                o0(vj0Var);
                                if (z10) {
                                    vj0Var.d.v0(0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final FrameLayout f0(Context context, int i10) {
        int i11;
        int i12;
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        frameLayout.addView(linearLayout, org.telegram.ui.Components.gb1.i(-1, -2, 17));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        linearLayout.addView(y9Var, org.telegram.ui.Components.gb1.u(130, 130, 1));
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(y9Var, "UtyaDuck", "😎", "130_130");
        TextView textView = new TextView(context);
        if (i10 == 1) {
            i11 = R.string.NewsCaughtUpTitleScroll;
        } else if (i10 == 2) {
            i11 = R.string.NewsCaughtUpTitleHeadlines;
        } else {
            i11 = R.string.NewsCaughtUpTitle;
        }
        textView.setText(LocaleController.getString(i11));
        textView.setTextSize(20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        textView.setGravity(17);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, org.telegram.ui.Components.gb1.o(0.0f, 16.0f, 0.0f, 0.0f, -1, -2), context);
        if (i10 == 1) {
            i12 = R.string.NewsCaughtUpSubtitleScroll;
        } else if (i10 == 2) {
            i12 = R.string.NewsCaughtUpSubtitleHeadlines;
        } else {
            i12 = R.string.NewsCaughtUpSubtitle;
        }
        e.setText(LocaleController.getString(i12));
        e.setTextSize(14.0f);
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.f23746y6, getResourceProvider());
        e.setGravity(17);
        linearLayout.addView(e, org.telegram.ui.Components.gb1.o(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return frameLayout;
    }

    public final bi.mc g0(Context context) {
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.utyan_empty, 130, 130, null);
        imageView.d();
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
        textView.setTextSize(20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        textView2.setTextSize(14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23746y6, getResourceProvider());
        textView2.setGravity(17);
        bi.mc mcVar = new bi.mc(context, textView, textView2, imageView);
        mcVar.setOrientation(1);
        mcVar.setGravity(17);
        mcVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(12.0f));
        mcVar.addView((View) imageView, org.telegram.ui.Components.gb1.x(130, 130, 1, 0, 0, 0, 16));
        mcVar.addView(textView, org.telegram.ui.Components.gb1.r(-1, -2));
        mcVar.addView(textView2, org.telegram.ui.Components.gb1.o(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return mcVar;
    }

    public final org.telegram.ui.Components.r71 h0(Context context, int i10) {
        vj0 vj0Var = this.f45781b[i10];
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(context, this.currentAccount, this.classGuid, false, new bi.v0(this, i10, vj0Var, context, 8), new i2.z(this, i10, vj0Var, 14), null, this.resourceProvider);
        r71Var.setClipToPadding(false);
        r71Var.setPadding(0, 0, 0, i0(i10));
        r71Var.j(new uj0(this, i10, r71Var, vj0Var));
        return r71Var;
    }

    public final int i0(int i10) {
        int i11;
        int i12 = this.f45788x;
        if (j0()) {
            i11 = 60;
        } else {
            i11 = 0;
        }
        int dp = AndroidUtilities.dp(i11 + 72) + i12;
        if (i10 == 2) {
            return Math.max(dp, this.J);
        }
        return AndroidUtilities.dp(42.0f) + dp;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0() {
        if (!this.f45783f) {
            HashSet hashSet = this.d;
            if (hashSet.isEmpty() || hashSet.equals(this.e)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        int i10 = k1Var.f47115a.f(8).d;
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        p0(false);
    }

    public final void k0() {
        if (!this.f45784n && !this.h) {
            this.f45784n = true;
            this.f45785r = false;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(new TL_feed.TL_feed_getInterestCategories(), new pj0(this, 0)), this.classGuid);
        }
    }

    public final void l0(int i10, boolean z10) {
        TL_feed.TL_feed_getForYou tL_feed_getForYou;
        TL_feed.FeedPosition feedPosition;
        org.telegram.ui.Components.wz wzVar;
        vj0 vj0Var = this.f45781b[i10];
        if (!this.h) {
            if (vj0Var.h) {
                vj0Var.f44843l |= z10;
            } else if (z10 || !vj0Var.f44841j) {
                if (i10 != 2 || !TextUtils.isEmpty(this.N)) {
                    if (i10 == 2 && !z10 && (this.O != null || !vj0Var.f44840i)) {
                        return;
                    }
                    String str = this.N;
                    vj0Var.f44844m = z10;
                    vj0Var.f44845n = z10;
                    if (z10 && (wzVar = vj0Var.e) != null) {
                        wzVar.setRefreshing(true);
                    }
                    vj0Var.h = true;
                    vj0Var.f44842k = false;
                    o0(vj0Var);
                    if (i10 != 0 && i10 != 2) {
                        TL_feed.TL_feed_getFeed tL_feed_getFeed = new TL_feed.TL_feed_getFeed();
                        tL_feed_getFeed.limit = 30;
                        if (z10) {
                            feedPosition = null;
                        } else {
                            feedPosition = vj0Var.f44846o;
                        }
                        tL_feed_getFeed.offset_position = feedPosition;
                        tL_feed_getForYou = tL_feed_getFeed;
                    } else {
                        TL_feed.TL_feed_getForYou tL_feed_getForYou2 = new TL_feed.TL_feed_getForYou();
                        tL_feed_getForYou2.limit = 30;
                        if (i10 == 2) {
                            tL_feed_getForYou2.query = str;
                        }
                        tL_feed_getForYou = tL_feed_getForYou2;
                    }
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_feed_getForYou, new org.telegram.messenger.ac(this, vj0Var, i10, str, z10)), this.classGuid);
                }
            }
        }
    }

    public final void m0(vj0 vj0Var) {
        org.telegram.ui.Components.r71 r71Var;
        int i10;
        int i11;
        int i12;
        if (!this.h && (r71Var = vj0Var.d) != null) {
            int L0 = r71Var.f32149f3.L0();
            int N0 = vj0Var.d.f32149f3.N0();
            if (L0 >= 0) {
                TLRPC.Message message = null;
                while (L0 <= N0) {
                    org.telegram.ui.Components.t61 G = vj0Var.d.f32150g3.G(L0);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof MessageObject) {
                            TLRPC.Message message2 = ((MessageObject) obj).messageOwner;
                            if (message == null || (i11 = message2.date) > (i12 = message.date) || (i11 == i12 && message2.f22048id > message.f22048id)) {
                                message = message2;
                            }
                        }
                    }
                    L0++;
                }
                if (message != null) {
                    TL_feed.FeedPosition feedPosition = new TL_feed.FeedPosition();
                    int i13 = message.date;
                    feedPosition.date = i13;
                    feedPosition.peer = message.peer_id;
                    int i14 = message.f22048id;
                    feedPosition.f22243id = i14;
                    TL_feed.FeedPosition feedPosition2 = vj0Var.f44847p;
                    if (feedPosition2 != null && i13 <= (i10 = feedPosition2.date) && (i13 != i10 || i14 <= feedPosition2.f22243id)) {
                        return;
                    }
                    vj0Var.f44847p = feedPosition;
                    rj0 rj0Var = vj0Var.f44848q;
                    if (rj0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(rj0Var);
                    }
                    rj0 rj0Var2 = new rj0(this, vj0Var, 1);
                    vj0Var.f44848q = rj0Var2;
                    AndroidUtilities.runOnUIThread(rj0Var2, 500L);
                }
            }
        }
    }

    public final void n0(String str) {
        boolean z10;
        if (!str.equals(this.N)) {
            this.N = str;
            vj0[] vj0VarArr = this.f45781b;
            vj0 vj0Var = vj0VarArr[2];
            qj0 qj0Var = this.O;
            if (qj0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(qj0Var);
            }
            this.O = null;
            vj0Var.f44835a.clear();
            vj0Var.f44836b.clear();
            vj0Var.f44837c.clear();
            vj0Var.f44838f = null;
            vj0Var.f44840i = false;
            vj0Var.f44842k = false;
            vj0Var.f44841j = false;
            vj0Var.f44843l = false;
            o0(vj0Var);
            if (this.H && !TextUtils.isEmpty(this.N)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.I != z10) {
                this.I = z10;
                org.telegram.ui.Components.r71 r71Var = vj0VarArr[2].d;
                boolean z11 = !z10;
                d0(this.v, z11);
                d0(this.G, z11);
                d0(r71Var, z10);
                if (z10) {
                    r71Var.v0(0);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            qj0 qj0Var2 = new qj0(this, 2);
            this.O = qj0Var2;
            AndroidUtilities.runOnUIThread(qj0Var2, 500L);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.H) {
            if (z10) {
                this.actionBar.g(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!super.onFragmentCreate()) {
            return false;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.channelNewsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        vj0[] vj0VarArr;
        this.h = true;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35535h1.d.remove(this);
        }
        qj0 qj0Var = this.O;
        if (qj0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(qj0Var);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.channelNewsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        setBulletinDelegate(null);
        super.onFragmentDestroy();
        for (vj0 vj0Var : this.f45781b) {
            rj0 rj0Var = vj0Var.f44848q;
            if (rj0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(rj0Var);
                vj0Var.f44848q.run();
            }
            vj0Var.d = null;
            vj0Var.e = null;
            vj0Var.f44838f = null;
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.f45780a;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(boolean z10) {
        int i02;
        float f7;
        float f10;
        int i10;
        HashSet hashSet;
        boolean j02 = j0();
        if (this.f45789y != null) {
            Boolean bool = this.F;
            if (bool == null || bool.booleanValue() != j02) {
                this.F = Boolean.valueOf(j02);
                this.f45789y.animate().cancel();
                float f11 = 0.0f;
                float f12 = 1.0f;
                if (z10) {
                    if (j02) {
                        if (this.f45789y.getVisibility() != 0) {
                            this.f45789y.setAlpha(0.0f);
                            this.f45789y.setScaleX(0.7f);
                            this.f45789y.setScaleY(0.7f);
                            this.f45789y.setTranslationY(AndroidUtilities.dp(10.0f));
                        }
                        this.f45789y.setVisibility(0);
                        this.f45789y.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(null).start();
                    } else {
                        this.f45789y.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).translationY(AndroidUtilities.dp(10.0f)).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new qj0(this, 1)).start();
                    }
                } else {
                    di.i4 i4Var = this.f45789y;
                    if (j02) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    i4Var.setAlpha(f7);
                    di.i4 i4Var2 = this.f45789y;
                    if (j02) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.7f;
                    }
                    i4Var2.setScaleX(f10);
                    di.i4 i4Var3 = this.f45789y;
                    if (!j02) {
                        f12 = 0.7f;
                    }
                    i4Var3.setScaleY(f12);
                    di.i4 i4Var4 = this.f45789y;
                    if (!j02) {
                        f11 = AndroidUtilities.dp(10.0f);
                    }
                    i4Var4.setTranslationY(f11);
                    di.i4 i4Var5 = this.f45789y;
                    if (j02) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    i4Var5.setVisibility(i10);
                }
            }
            this.f45789y.setEnabled(!this.f45783f);
            this.E.setLoading(this.f45783f);
            this.E.b(this.d.size(), z10);
            this.f45789y.setContentDescription(LocaleController.getString(R.string.NewsSaveInterests) + ", " + hashSet.size());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f45789y.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(72.0f) + this.f45788x;
            this.f45789y.setLayoutParams(layoutParams);
        }
        int i11 = 0;
        while (true) {
            vj0[] vj0VarArr = this.f45781b;
            if (i11 < vj0VarArr.length) {
                vj0 vj0Var = vj0VarArr[i11];
                if (vj0Var.d != null && vj0Var.d.getPaddingBottom() != (i02 = i0(i11))) {
                    vj0Var.d.setPadding(0, 0, 0, i02);
                    ViewGroup viewGroup = vj0Var.f44838f;
                    if (viewGroup != null) {
                        viewGroup.requestLayout();
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void s() {
        boolean z10 = this.I;
        vj0[] vj0VarArr = this.f45781b;
        if (z10) {
            vj0VarArr[2].d.y0(0);
            return;
        }
        fi.h1 h1Var = this.v;
        if (h1Var != null && vj0VarArr[h1Var.getCurrentPosition()].d != null) {
            vj0VarArr[this.v.getCurrentPosition()].d.y0(0);
        }
    }

    @Override
    public final hh.d y() {
        return null;
    }

    @Override
    public final void t() {
    }
}
