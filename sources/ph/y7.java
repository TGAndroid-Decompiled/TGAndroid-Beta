package ph;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sd0;
public final class y7 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final sd0 B;
    public boolean C;
    public org.telegram.ui.ActionBar.d2 D;
    public long E;
    public String F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList I;
    public boolean J;
    public boolean K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public final e8 T;
    public int f42658a;
    public final a0.h f42659b;
    public final ArrayList f42660c;
    public final HashMap d;
    public final FrameLayout e;
    public final rl0 f42661f;
    public final f2.i0 h;
    public final u7 f42662n;
    public final w7 f42663r;
    public final View f42664s;
    public final d v;
    public final d f42665w;
    public final s7 f42666x;
    public final org.telegram.ui.Cells.t3 f42667y;

    public y7(e8 e8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var6;
        org.telegram.ui.ActionBar.f6 f6Var7;
        org.telegram.ui.ActionBar.f6 f6Var8;
        org.telegram.ui.ActionBar.f6 f6Var9;
        this.T = e8Var;
        this.f42659b = new a0.h();
        this.f42660c = new ArrayList();
        this.d = new HashMap();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.O = -1;
        f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, f6Var);
        this.f42667y = t3Var;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        s7 s7Var = new s7(this, context, f6Var2, new q7(this, 4));
        this.f42666x = s7Var;
        int i12 = org.telegram.ui.ActionBar.j6.f19952h5;
        s7Var.setBackgroundColor(e8Var.getThemedColor(i12));
        s7Var.setOnSearchTextChange(new r7(this, 3));
        f6Var3 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        sd0 sd0Var = new sd0(context, f6Var3);
        this.B = sd0Var;
        sd0Var.h = new q7(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        f6Var4 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        rl0 rl0Var = new rl0(context, f6Var4);
        this.f42661f = rl0Var;
        rl0Var.setClipToPadding(false);
        rl0Var.setTranslateSelector(true);
        f6Var5 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        u7 u7Var = new u7(this, context, f6Var5, s7Var, new nh.t3(e8Var, 2));
        this.f42662n = u7Var;
        rl0Var.setAdapter(u7Var);
        u7Var.h = rl0Var;
        f2.i0 i0Var = new f2.i0();
        this.h = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setOnScrollListener(new org.telegram.ui.n6(this, 2));
        rl0Var.setOnItemClickListener(new org.telegram.ui.web.m(3, this, context));
        frameLayout.addView(rl0Var, k7.b6.c(-1.0f, -1));
        t7 t7Var = new t7(this);
        t7Var.n(350L);
        t7Var.o(mr.h);
        t7Var.C = false;
        t7Var.f5807m = false;
        rl0Var.setItemAnimator(t7Var);
        frameLayout.addView(s7Var, k7.b6.e(-1, -2, 55));
        frameLayout.addView(t3Var, k7.b6.e(-1, 32, 55));
        addView(sd0Var, k7.b6.e(-1, -2, 55));
        w7 w7Var = new w7(this, context);
        this.f42663r = w7Var;
        w7Var.setClickable(true);
        w7Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.g3) e8Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.g3) e8Var).backgroundPaddingLeft;
        w7Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        f6Var6 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var6));
        f6Var7 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        d dVar = new d(context, f6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new p7(this, 0));
        dVar.e();
        w7Var.addView(dVar, k7.b6.q(-1, 48, 87));
        f6Var8 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        d dVar2 = new d(context, f6Var8, false);
        this.f42665w = dVar2;
        dVar2.setOnClickListener(new p7(this, 1));
        dVar2.e();
        w7Var.addView(dVar2, k7.b6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f42664s = view;
        f6Var9 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var9));
        addView(view, k7.b6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(w7Var, k7.b6.e(-1, -2, 87));
    }

    public final void a(boolean z4) {
        int i10;
        if (this.f42658a == 6) {
            ArrayList arrayList = this.f42660c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.h hVar = this.f42659b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                if (((Boolean) hVar.n(i11)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j10));
                }
                i11++;
            }
            if (z4) {
                g(true);
                e(true);
                f(true);
            }
        }
    }

    public final void b(int i10) {
        int i11;
        this.f42658a = i10;
        this.f42659b.b();
        ArrayList arrayList = this.f42660c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        e8 e8Var = this.T;
        if (i10 == 4) {
            arrayList.addAll(e8Var.d);
            hashMap.putAll(e8Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(e8Var.G);
        } else if (i10 == 1) {
            ArrayList J0 = e8.J0(e8Var);
            for (int i12 = 0; i12 < J0.size(); i12 = android.support.v4.media.a.g(((TLRPC.User) J0.get(i12)).f19306id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(e8Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(e8Var.f41624n);
            hashMap.putAll(e8Var.f41625r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f42662n.getClass();
        this.h.k1(false);
        i(false);
        s7 s7Var = this.f42666x;
        s7Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        s7Var.setVisibility(i11);
        s7Var.H = true;
        this.F = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f42658a;
        rl0 rl0Var = this.f42661f;
        if (i13 != 0) {
            rl0Var.u0(0);
        }
        rl0Var.requestLayout();
        this.O = -1;
    }

    public final float c() {
        int i10 = 0;
        float f10 = -kf.k0.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f42666x.G), 0);
        while (true) {
            rl0 rl0Var = this.f42661f;
            if (i10 < rl0Var.getChildCount()) {
                View childAt = rl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f10, childAt.getY());
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        boolean z4;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f42658a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        e8 e8Var = this.T;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f19306id != 777000 && j11 != 0) {
                    if (z4 && !user.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f42660c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var2);
                alertDialog$Builder.f19478a.Q = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, f6Var);
            alertDialog$Builder2.f19478a.Q = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new e3.f(this, j10, arrayList, 10));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f42659b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f42666x.H = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.d2 d2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (d2Var = this.D) != null && this.E == chatFull.f19160id) {
            d2Var.c(350L);
            this.D = null;
            this.E = -1L;
            d(chatFull.f19160id, chatFull.participants);
        }
    }

    public final void e(boolean z4) {
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f42658a;
        e8 e8Var = this.T;
        d dVar = this.f42665w;
        int i13 = 0;
        boolean z11 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z4);
            if (e8Var.I) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else if (e8Var.W) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else {
                int i14 = e8Var.F;
                if (i14 == 1) {
                    if (e8Var.H) {
                        i11 = R.string.StoryLivePrivacyButtonPost;
                    } else {
                        i11 = R.string.StoryPrivacyButtonPost;
                    }
                    dVar2.g(LocaleController.getString(i11), z4, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i14), z4, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f42660c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z4, true);
            dVar2.c(arrayList.size(), z4);
            dVar.setVisibility(8);
            return;
        }
        w7 w7Var = this.f42663r;
        if (i12 == 3) {
            int size = e8.l1(arrayList, this.d).size();
            e8Var.f41626s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7Var.b(z10, z4);
            dVar2.c(size, z4);
            if (size > 0) {
                z11 = true;
            }
            dVar2.setEnabled(z11);
            dVar.setVisibility(8);
        } else if (i12 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
                dVar2.c(0, z4);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z4, true);
                dVar2.c(arrayList.size(), z4);
            }
            dVar.setVisibility(8);
        } else if (i12 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z4);
            dVar.setVisibility(8);
        } else if (i12 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z4, true);
            i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
            nh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.h hVar = this.f42659b;
                    if (i13 >= hVar.m()) {
                        break;
                    }
                    long j10 = hVar.j(i13);
                    ((Boolean) hVar.n(i13)).getClass();
                    storiesController.L.contains(Long.valueOf(j10));
                    i13++;
                }
            } else {
                dVar2.c(arrayList.size(), z4);
            }
            dVar.setVisibility(8);
        } else if (i12 == 4) {
            int size2 = e8.l1(e8Var.d, e8Var.e).size();
            e8Var.f41623f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            dVar2.setShowZero(false);
            w7Var.b(false, z4);
            dVar2.c(size2, z4);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z4) {
        ArrayList arrayList;
        int R;
        boolean z10;
        e8 e8Var = this.T;
        ArrayList arrayList2 = e8Var.G;
        HashMap hashMap = e8Var.f41625r;
        ArrayList arrayList3 = e8Var.f41624n;
        ArrayList arrayList4 = e8Var.h;
        HashMap hashMap2 = e8Var.e;
        ArrayList arrayList5 = e8Var.d;
        int i10 = this.f42658a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f42660c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f42658a == 3 && (e8Var.K != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.O;
                if (i11 != -1) {
                    e8Var.K = i11;
                }
            } else {
                this.O = e8Var.K;
                e8Var.K = 3;
            }
        }
        HashSet l1 = e8.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.I;
            boolean z11 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            o7 o7Var = (o7) arrayList.get(i12);
            if (o7Var != null) {
                int i13 = o7Var.f42106i;
                if (i13 > 0) {
                    if (e8Var.K != i13) {
                        z11 = false;
                    }
                    o7Var.f42108k = z11;
                    o7Var.f42109l = false;
                } else {
                    TLRPC.User user = o7Var.f42105g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f19306id));
                        o7Var.f42108k = contains;
                        o7Var.f42109l = (contains || !l1.contains(Long.valueOf(o7Var.f42105g.f19306id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = o7Var.h;
                        if (chat != null) {
                            o7Var.f42108k = hashMap3.containsKey(Long.valueOf(chat.f19159id));
                            o7Var.f42109l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            rl0 rl0Var = this.f42661f;
            if (i14 < rl0Var.getChildCount()) {
                View childAt = rl0Var.getChildAt(i14);
                if ((childAt instanceof d8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    o7 o7Var2 = (o7) arrayList.get(R);
                    d8 d8Var = (d8) childAt;
                    if (!o7Var2.f42108k && !o7Var2.f42109l) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    d8Var.c(z10, z4);
                    TLRPC.Chat chat2 = o7Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (e8.d1(e8Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        d8Var.b(f10, z4);
                    } else {
                        if (o7Var2.f42109l && !o7Var2.f42108k) {
                            f10 = 0.5f;
                        }
                        d8Var.b(f10, z4);
                    }
                }
                i14++;
            } else {
                h(z4);
                return;
            }
        }
    }

    public final void g(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: ph.y7.g(boolean):void");
    }

    public final void h(boolean z4) {
        org.telegram.ui.Cells.t3 t3Var = this.f42667y;
        if (t3Var == null) {
            return;
        }
        if (e8.l1(this.f42660c, this.d).size() > 0) {
            t3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new p7(this, 2));
        } else if (z4) {
            t3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.s3 s3Var = t3Var.f22321b;
            s3Var.c(null, false, true);
            s3Var.setOnClickListener(null);
            s3Var.setVisibility(0);
        }
    }

    public final void i(boolean z4) {
        int i10;
        s7 s7Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.f6 f6Var;
        HashSet l1 = e8.l1(this.f42660c, this.d);
        int i11 = this.f42658a;
        e8 e8Var = this.T;
        if (i11 == 3) {
            e8Var.f41626s = l1.size();
        } else if (i11 == 4) {
            e8Var.f41623f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            s7Var = this.f42666x;
            ArrayList arrayList4 = s7Var.d;
            arrayList = s7Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            o30 o30Var = (o30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(o30Var.getUid()))) {
                arrayList2.add(o30Var);
            }
            i12++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((o30) arrayList.get(i13)).getUid() == longValue) {
                        break;
                    }
                    i13++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController.getUser(l10);
                    } else {
                        chat = messagesController.getChat(l10);
                    }
                    Object obj = chat;
                    if (obj != null) {
                        Context context = getContext();
                        f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
                        o30 o30Var2 = new o30(context, obj, null, true, f6Var);
                        o30Var2.setOnClickListener(this);
                        arrayList3.add(o30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        kg.j jVar = s7Var.f41334c;
        ArrayList arrayList5 = jVar.e;
        ArrayList arrayList6 = jVar.d;
        ArrayList arrayList7 = jVar.f10543f;
        b8 b8Var = (b8) jVar.f10544n;
        b8Var.D = true;
        ArrayList arrayList8 = b8Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = jVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((o30) arrayList2.get(i14)).setOnClickListener(null);
        }
        jVar.c();
        if (z4) {
            jVar.f10542c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f10541b = animatorSet;
            animatorSet.addListener(new a8(jVar, arrayList2, 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i15 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i15 >= size) {
                    break;
                }
                o30 o30Var3 = (o30) arrayList2.get(i15);
                arrayList5.add(o30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                o30 o30Var4 = (o30) arrayList3.get(i16);
                arrayList6.add(o30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                jVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            jVar.f10541b = null;
            jVar.f10542c = false;
            b8Var.f41332a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            jVar.addView((View) arrayList3.get(i18));
        }
        jVar.requestLayout();
    }

    public final void j() {
        float c3 = c();
        boolean z4 = this.J;
        boolean z10 = false;
        float f10 = 1.0f;
        s7 s7Var = this.f42666x;
        if (!z4 && !this.R && getTranslationX() == 0.0f) {
            if (!this.K || Math.abs(this.L - c3) > 1.0f) {
                this.K = true;
                ValueAnimator valueAnimator = this.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.M = null;
                }
                float translationY = s7Var.getTranslationY();
                this.L = c3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c3);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new nh.e5(this, 22));
                this.M.addListener(new j2(this, 5));
                this.M.setInterpolator(new LinearInterpolator());
                this.M.setDuration(180L);
                this.M.start();
            }
        } else {
            this.K = false;
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.M = null;
            }
            s7Var.setTranslationY(c3);
        }
        boolean z11 = this.C;
        sd0 sd0Var = this.B;
        if (!z11) {
            sd0Var.setVisibility(8);
            return;
        }
        sd0Var.setVisibility(0);
        float f11 = -sd0Var.getHeight();
        int i10 = 0;
        while (true) {
            rl0 rl0Var = this.f42661f;
            if (i10 < rl0Var.getChildCount()) {
                View childAt = rl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f11 = this.e.getPaddingTop() + childAt.getY();
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (this.N != z10) {
            this.N = z10;
            ((org.telegram.ui.ActionBar.i2) sd0Var.e).c((z10 || this.f42658a != 0) ? 0.0f : 0.0f, true);
        }
        sd0Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f11));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        s7 s7Var = this.f42666x;
        if (!s7Var.d.contains(view)) {
            return;
        }
        o30 o30Var = (o30) view;
        if (o30Var.f27451y) {
            s7Var.e = null;
            kg.j jVar = s7Var.f41334c;
            b8 b8Var = (b8) jVar.f10544n;
            b8Var.D = true;
            b8Var.d.remove(o30Var);
            o30Var.setOnClickListener(null);
            jVar.c();
            jVar.f10542c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f10541b = animatorSet;
            animatorSet.addListener(new ex0(18, jVar, o30Var));
            ArrayList arrayList = jVar.h;
            arrayList.clear();
            arrayList.add(o30Var);
            ArrayList arrayList2 = jVar.d;
            arrayList2.clear();
            jVar.e.clear();
            arrayList2.add(o30Var);
            ArrayList arrayList3 = jVar.f10543f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.ALPHA, 1.0f, 0.0f));
            jVar.requestLayout();
            long uid = o30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f42660c;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                        it.remove();
                        arrayList4.addAll((Collection) entry.getValue());
                        arrayList4.remove(Long.valueOf(uid));
                    }
                } else {
                    arrayList4.remove(Long.valueOf(uid));
                    f(true);
                    e(true);
                    return;
                }
            }
        } else {
            o30 o30Var2 = s7Var.e;
            if (o30Var2 != null) {
                o30Var2.a();
                s7Var.e = null;
            }
            s7Var.e = o30Var;
            o30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        boolean z4;
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        float f10;
        boolean z15;
        int i15;
        e8 e8Var = this.T;
        i12 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardHeight;
            this.Q = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f42658a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z16 = this.S;
        z4 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
        rl0 rl0Var = this.f42661f;
        w7 w7Var = this.f42663r;
        if (z16 != z4) {
            float c3 = c();
            z10 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
            if (z10 && c3 + Math.min(AndroidUtilities.dp(150.0f), this.f42666x.G) > rl0Var.getPaddingTop()) {
                wh.o oVar = new wh.o(getContext(), 2, 0.7f);
                oVar.f5712a = 1;
                oVar.f46707p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i17 = this.f42658a;
            View view = this.f42664s;
            float f11 = 0.0f;
            if (i17 == 0) {
                z14 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                if (z14) {
                    f10 = this.Q;
                } else {
                    f10 = 0.0f;
                }
                w7Var.setTranslationY(f10);
                z15 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                if (z15) {
                    f11 = this.Q;
                }
                view.setTranslationY(f11);
            } else {
                z11 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                if (z11) {
                    i13 = this.Q;
                } else {
                    i13 = -this.Q;
                }
                float f12 = i13;
                ValueAnimator valueAnimator = w7Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    w7Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                w7Var.d = ofFloat;
                ofFloat.addUpdateListener(new v7(w7Var, 1));
                w7Var.d.addListener(new j2(w7Var, 6));
                w7Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = w7Var.d;
                mr mrVar = org.telegram.ui.ActionBar.r1.f20518w;
                valueAnimator2.setInterpolator(mrVar);
                w7Var.d.start();
                z12 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                if (z12) {
                    i14 = this.Q;
                } else {
                    i14 = -this.Q;
                }
                view.setTranslationY(i14);
                this.R = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(mrVar).withEndAction(new q7(this, 2)).start();
            }
            z13 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
            this.S = z13;
        }
        rl0Var.setPadding(0, 0, 0, w7Var.getMeasuredHeight());
    }
}
