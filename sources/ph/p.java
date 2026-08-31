package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import mh.m5;
import oh.d6;
import oh.f5;
import oh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.k11;
import org.telegram.ui.qd1;
import qh.s6;
public abstract class p extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray B;
    public static LongSparseArray C;
    public final p2 f44406a;
    public final int f44407b;
    public final g6 f44408c;
    public final long d;
    public final d6 f44409e;
    public final ArrayList f44410f;
    public final ArrayList h;
    public final k11 f44411n;
    public final l81 f44412r;
    public Boolean f44413s;
    public int v;
    public float f44414w;
    public ValueAnimator f44415x;
    public int f44416y;

    public p(Context context, p2 p2Var, long j10) {
        super(context);
        this.f44410f = new ArrayList();
        this.h = new ArrayList();
        this.f44413s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f44416y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f44406a = p2Var;
        int currentAccount = p2Var.getCurrentAccount();
        this.f44407b = currentAccount;
        g6 resourceProvider = p2Var.getResourceProvider();
        this.f44408c = resourceProvider;
        this.d = j10;
        setBackgroundColor(k6.v(k6.v0(k6.f21659d6, resourceProvider), k6.l1(0.04f, k6.v0(k6.G6, resourceProvider))));
        if (C == null) {
            C = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) C.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = C;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        d6 d6Var = (d6) longSparseArray.get(j10);
        if (d6Var == null) {
            d6 d6Var2 = new d6(currentAccount, j10, "", null);
            longSparseArray.put(j10, d6Var2);
            d6Var = d6Var2;
        }
        this.f44409e = d6Var;
        or0 or0Var = (or0) this;
        k11 k11Var = new k11(or0Var, context);
        this.f44411n = k11Var;
        k11Var.setAllowDisallowInterceptTouch(true);
        k11Var.setAdapter(new a(or0Var, context));
        addView(k11Var, c6.e(-1, -1, 119));
        l81 n10 = k11Var.n(9, true);
        this.f44412r = n10;
        n10.f28667r = 12;
        n10.setPreTabClick(new m5(or0Var, 21));
        addView(n10, c6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        p2 p2Var = this.f44406a;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            mi miVar = new mi(p2Var.getParentActivity(), this.f44406a, false, false, false, this.f44408c);
            miVar.J1(1, false);
            miVar.Q0 = true;
            miVar.P0 = false;
            miVar.f29055g1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            miVar.f29054g0.f0();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
            }
            miVar.W1 = new b(this, miVar, str);
            miVar.r1();
            miVar.show();
        }
    }

    public final void b(String str) {
        d6 d6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f44409e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f44410f;
            if (i10 < arrayList.size()) {
                d6Var = (d6) arrayList.get(i10);
                if (d6Var != null && TextUtils.equals(d6Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                d6Var = null;
                break;
            }
        }
        if (d6Var != null) {
            ArrayList arrayList2 = d6Var.f17402i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f44407b;
            deletepreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList2.get(i12)).storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(MessagesController.toInputMedia(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f44412r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        d6 d6Var;
        View currentView = this.f44411n.getCurrentView();
        if ((currentView instanceof l) && (d6Var = ((l) currentView).f44391a) != null) {
            ArrayList arrayList = d6Var.f17402i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!c((MessageObject) arrayList.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.storiesListUpdated;
        k11 k11Var = this.f44411n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            d6 d6Var = this.f44409e;
            if (obj == d6Var) {
                i(true);
                View[] viewPages = k11Var.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof l) {
                        l lVar = (l) view;
                        if (lVar.f44391a == d6Var) {
                            lVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f44410f.indexOf(obj) >= 0) {
                View[] viewPages2 = k11Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof l) {
                        l lVar2 = (l) view2;
                        if (lVar2.f44391a == objArr[0]) {
                            lVar2.v.l();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            i(true);
            View[] viewPages3 = k11Var.getViewPages();
            int length2 = viewPages3.length;
            while (i13 < length2) {
                View view3 = viewPages3[i13];
                if (view3 instanceof l) {
                    ((l) view3).v.l();
                }
                i13++;
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        d6 d6Var;
        View currentView = this.f44411n.getCurrentView();
        if ((currentView instanceof l) && (d6Var = ((l) currentView).f44391a) != null) {
            ArrayList arrayList = d6Var.f17402i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!c((MessageObject) arrayList.get(i10))) {
                    e((MessageObject) arrayList.get(i10));
                }
            }
        }
    }

    public abstract boolean g(MessageObject messageObject);

    public String getBotPreviewsSubtitle() {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb = new StringBuilder();
        View currentView = this.f44411n.getCurrentView();
        if (currentView instanceof l) {
            d6 d6Var = ((l) currentView).f44391a;
            if (d6Var != null) {
                ArrayList arrayList = d6Var.f17402i;
                i10 = 0;
                i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    TL_stories.StoryItem storyItem = messageObject.storyItem;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (MessageObject.isVideoDocument(messageMedia.document)) {
                            i11++;
                        } else if (messageObject.storyItem.media.photo != null) {
                            i10++;
                        }
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return LocaleController.getString(R.string.BotPreviewEmpty);
            }
            if (i10 > 0) {
                sb.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
            }
            if (i11 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
            }
        }
        return sb.toString();
    }

    public String getCurrentLang() {
        View view;
        d6 d6Var;
        k11 k11Var = this.f44411n;
        View[] viewPages = k11Var.getViewPages();
        if (Math.abs(k11Var.getCurrentPosition() - k11Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof l) && (d6Var = ((l) view).f44391a) != null) {
            return d6Var.E;
        }
        return null;
    }

    public d6 getCurrentList() {
        d6 d6Var;
        View currentView = this.f44411n.getCurrentView();
        if ((currentView instanceof l) && (d6Var = ((l) currentView).f44391a) != null) {
            return d6Var;
        }
        return null;
    }

    public tl0 getCurrentListView() {
        View currentView = this.f44411n.getCurrentView();
        if (currentView instanceof l) {
            return ((l) currentView).f44395f;
        }
        return null;
    }

    public int getItemsCount() {
        d6 d6Var;
        View currentView = this.f44411n.getCurrentView();
        if ((currentView instanceof l) && (d6Var = ((l) currentView).f44391a) != null) {
            return d6Var.f17402i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        d6 d6Var;
        View currentView = this.f44411n.getCurrentView();
        if ((currentView instanceof l) && (d6Var = ((l) currentView).f44391a) != null) {
            ArrayList arrayList = d6Var.f17402i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (c((MessageObject) arrayList.get(i10))) {
                    g((MessageObject) arrayList.get(i10));
                }
            }
        }
    }

    public final void i(boolean z4) {
        boolean z10;
        float f10;
        d6 d6Var;
        s6 s6Var;
        ArrayList arrayList = new ArrayList(this.f44409e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        t6 storiesController = MessagesController.getInstance(this.f44407b).getStoriesController();
        long j10 = this.d;
        ArrayList E = storiesController.E(j10);
        if (E != null) {
            int size2 = E.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E.get(i11);
                i11++;
                oh.s6 s6Var2 = (oh.s6) obj2;
                if (s6Var2 != null && (s6Var = s6Var2.f17737c) != null && s6Var.J0 == j10 && !TextUtils.isEmpty(s6Var.K0) && !arrayList.contains(s6Var.K0)) {
                    arrayList.add(s6Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f44410f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            String str2 = (String) obj3;
            int i13 = 0;
            while (true) {
                if (i13 < arrayList4.size()) {
                    if (TextUtils.equals(((d6) arrayList4.get(i13)).E, str2)) {
                        d6Var = (d6) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    d6Var = null;
                    break;
                }
            }
            if (d6Var == null) {
                d6 d6Var2 = new d6(this.f44407b, this.d, str2, null);
                d6Var2.H(null);
                d6Var = d6Var2;
            }
            arrayList3.add(d6Var);
        }
        k11 k11Var = this.f44411n;
        k11Var.o(true);
        SpannableString spannableString = new SpannableString(y3.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        oq oqVar = new oq(R.drawable.msg_filled_plus, 0);
        oqVar.setScale(0.9f, 0.9f);
        oqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(oqVar, 0, 1, 33);
        l81 l81Var = this.f44412r;
        l81Var.a(-1, spannableString);
        l81Var.f28670x.l();
        if (arrayList3.size() + 1 > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f44413s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f44415x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f44413s = Boolean.valueOf(z10);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z4) {
            if (!z10) {
                f11 = 0.0f;
            }
            this.f44414w = f11;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            l81Var.setTranslationY(AndroidUtilities.dp(f10));
            if (z10) {
                f12 = 42.0f;
            }
            k11Var.setTranslationY(AndroidUtilities.dp(f12));
            return;
        }
        float f13 = this.f44414w;
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f44415x = ofFloat;
        ofFloat.addUpdateListener(new f5(this, 11));
        this.f44415x.addListener(new qd1(4, this, z10));
        this.f44415x.setDuration(320L);
        this.f44415x.setInterpolator(pr.h);
        this.f44415x.start();
    }

    public final void j() {
        View currentView = this.f44411n.getCurrentView();
        if (currentView instanceof l) {
            l lVar = (l) currentView;
            e eVar = lVar.f44395f;
            for (int i10 = 0; i10 < eVar.getChildCount(); i10++) {
                View childAt = eVar.getChildAt(i10);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    r7Var.i(lVar.T.c(r7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (B == null) {
            B = new LongSparseArray();
        }
        LongSparseArray longSparseArray = B;
        int i10 = this.f44407b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            B.put(i10, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (B == null) {
            B = new LongSparseArray();
        }
        LongSparseArray longSparseArray = B;
        int i10 = this.f44407b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f44411n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof l) {
                    ((l) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
