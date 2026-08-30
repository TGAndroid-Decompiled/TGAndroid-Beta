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
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.sl0;
public final class z7 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final rd0 B;
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
    public final f8 T;
    public int f42660a;
    public final a0.h f42661b;
    public final ArrayList f42662c;
    public final HashMap d;
    public final FrameLayout e;
    public final sl0 f42663f;
    public final f2.i0 h;
    public final v7 f42664n;
    public final x7 f42665r;
    public final View f42666s;
    public final d v;
    public final d f42667w;
    public final t7 f42668x;
    public final org.telegram.ui.Cells.u3 f42669y;

    public z7(f8 f8Var, Context context) {
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
        this.T = f8Var;
        this.f42661b = new a0.h();
        this.f42662c = new ArrayList();
        this.d = new HashMap();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.O = -1;
        f6Var = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, f6Var);
        this.f42669y = u3Var;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        t7 t7Var = new t7(this, context, f6Var2, new r7(this, 4));
        this.f42668x = t7Var;
        int i12 = org.telegram.ui.ActionBar.j6.f19977h5;
        t7Var.setBackgroundColor(f8Var.getThemedColor(i12));
        t7Var.setOnSearchTextChange(new s7(this, 3));
        f6Var3 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        rd0 rd0Var = new rd0(context, f6Var3);
        this.B = rd0Var;
        rd0Var.h = new r7(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        f6Var4 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        sl0 sl0Var = new sl0(context, f6Var4);
        this.f42663f = sl0Var;
        sl0Var.setClipToPadding(false);
        sl0Var.setTranslateSelector(true);
        f6Var5 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        v7 v7Var = new v7(this, context, f6Var5, t7Var, new nh.t3(f8Var, 2));
        this.f42664n = v7Var;
        sl0Var.setAdapter(v7Var);
        v7Var.h = sl0Var;
        f2.i0 i0Var = new f2.i0();
        this.h = i0Var;
        sl0Var.setLayoutManager(i0Var);
        sl0Var.setOnScrollListener(new org.telegram.ui.l6(this, 2));
        sl0Var.setOnItemClickListener(new org.telegram.ui.web.m(3, this, context));
        frameLayout.addView(sl0Var, k7.b6.c(-1.0f, -1));
        u7 u7Var = new u7(this);
        u7Var.n(350L);
        u7Var.o(nr.h);
        u7Var.C = false;
        u7Var.f5818m = false;
        sl0Var.setItemAnimator(u7Var);
        frameLayout.addView(t7Var, k7.b6.e(-1, -2, 55));
        frameLayout.addView(u3Var, k7.b6.e(-1, 32, 55));
        addView(rd0Var, k7.b6.e(-1, -2, 55));
        x7 x7Var = new x7(this, context);
        this.f42665r = x7Var;
        x7Var.setClickable(true);
        x7Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.g3) f8Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.g3) f8Var).backgroundPaddingLeft;
        x7Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        f6Var6 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        x7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var6));
        f6Var7 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        d dVar = new d(context, f6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new q7(this, 0));
        dVar.e();
        x7Var.addView(dVar, k7.b6.q(-1, 48, 87));
        f6Var8 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        d dVar2 = new d(context, f6Var8, false);
        this.f42667w = dVar2;
        dVar2.setOnClickListener(new q7(this, 1));
        dVar2.e();
        x7Var.addView(dVar2, k7.b6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f42666s = view;
        f6Var9 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var9));
        addView(view, k7.b6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(x7Var, k7.b6.e(-1, -2, 87));
    }

    public final void a(boolean z4) {
        int i10;
        if (this.f42660a == 6) {
            ArrayList arrayList = this.f42662c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.h hVar = this.f42661b;
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
        this.f42660a = i10;
        this.f42661b.b();
        ArrayList arrayList = this.f42662c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        f8 f8Var = this.T;
        if (i10 == 4) {
            arrayList.addAll(f8Var.d);
            hashMap.putAll(f8Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(f8Var.G);
        } else if (i10 == 1) {
            ArrayList J0 = f8.J0(f8Var);
            for (int i12 = 0; i12 < J0.size(); i12 = android.support.v4.media.a.g(((TLRPC.User) J0.get(i12)).f19331id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(f8Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(f8Var.f41660n);
            hashMap.putAll(f8Var.f41661r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f42664n.getClass();
        this.h.k1(false);
        i(false);
        t7 t7Var = this.f42668x;
        t7Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        t7Var.setVisibility(i11);
        t7Var.H = true;
        this.F = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f42660a;
        sl0 sl0Var = this.f42663f;
        if (i13 != 0) {
            sl0Var.u0(0);
        }
        sl0Var.requestLayout();
        this.O = -1;
    }

    public final float c() {
        int i10 = 0;
        float f10 = -kh.a2.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f42668x.G), 0);
        while (true) {
            sl0 sl0Var = this.f42663f;
            if (i10 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i10);
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
        int i11 = this.f42660a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        f8 f8Var = this.T;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f19331id != 777000 && j11 != 0) {
                    if (z4 && !user.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f42662c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var2);
                alertDialog$Builder.f19503a.Q = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, f6Var);
            alertDialog$Builder2.f19503a.Q = arrayList2.size() + " members are not in your contact list";
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
            this.f42661b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f42668x.H = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.d2 d2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (d2Var = this.D) != null && this.E == chatFull.f19185id) {
            d2Var.c(350L);
            this.D = null;
            this.E = -1L;
            d(chatFull.f19185id, chatFull.participants);
        }
    }

    public final void e(boolean z4) {
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f42660a;
        f8 f8Var = this.T;
        d dVar = this.f42667w;
        int i13 = 0;
        boolean z11 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z4);
            if (f8Var.I) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else if (f8Var.W) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else {
                int i14 = f8Var.F;
                if (i14 == 1) {
                    if (f8Var.H) {
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
        ArrayList arrayList = this.f42662c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z4, true);
            dVar2.c(arrayList.size(), z4);
            dVar.setVisibility(8);
            return;
        }
        x7 x7Var = this.f42665r;
        if (i12 == 3) {
            int size = f8.l1(arrayList, this.d).size();
            f8Var.f41662s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x7Var.b(z10, z4);
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
            i10 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
            nh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.h hVar = this.f42661b;
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
            int size2 = f8.l1(f8Var.d, f8Var.e).size();
            f8Var.f41659f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            dVar2.setShowZero(false);
            x7Var.b(false, z4);
            dVar2.c(size2, z4);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z4) {
        ArrayList arrayList;
        int R;
        boolean z10;
        f8 f8Var = this.T;
        ArrayList arrayList2 = f8Var.G;
        HashMap hashMap = f8Var.f41661r;
        ArrayList arrayList3 = f8Var.f41660n;
        ArrayList arrayList4 = f8Var.h;
        HashMap hashMap2 = f8Var.e;
        ArrayList arrayList5 = f8Var.d;
        int i10 = this.f42660a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f42662c;
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
        if (this.f42660a == 3 && (f8Var.K != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.O;
                if (i11 != -1) {
                    f8Var.K = i11;
                }
            } else {
                this.O = f8Var.K;
                f8Var.K = 3;
            }
        }
        HashSet l1 = f8.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.I;
            boolean z11 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            p7 p7Var = (p7) arrayList.get(i12);
            if (p7Var != null) {
                int i13 = p7Var.f42172i;
                if (i13 > 0) {
                    if (f8Var.K != i13) {
                        z11 = false;
                    }
                    p7Var.f42174k = z11;
                    p7Var.f42175l = false;
                } else {
                    TLRPC.User user = p7Var.f42171g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f19331id));
                        p7Var.f42174k = contains;
                        p7Var.f42175l = (contains || !l1.contains(Long.valueOf(p7Var.f42171g.f19331id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = p7Var.h;
                        if (chat != null) {
                            p7Var.f42174k = hashMap3.containsKey(Long.valueOf(chat.f19184id));
                            p7Var.f42175l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            sl0 sl0Var = this.f42663f;
            if (i14 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i14);
                if ((childAt instanceof e8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    p7 p7Var2 = (p7) arrayList.get(R);
                    e8 e8Var = (e8) childAt;
                    if (!p7Var2.f42174k && !p7Var2.f42175l) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    e8Var.c(z10, z4);
                    TLRPC.Chat chat2 = p7Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (f8.d1(f8Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        e8Var.b(f10, z4);
                    } else {
                        if (p7Var2.f42175l && !p7Var2.f42174k) {
                            f10 = 0.5f;
                        }
                        e8Var.b(f10, z4);
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
        throw new UnsupportedOperationException("Method not decompiled: ph.z7.g(boolean):void");
    }

    public final void h(boolean z4) {
        org.telegram.ui.Cells.u3 u3Var = this.f42669y;
        if (u3Var == null) {
            return;
        }
        if (f8.l1(this.f42662c, this.d).size() > 0) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new q7(this, 2));
        } else if (z4) {
            u3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.t3 t3Var = u3Var.f22387b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
    }

    public final void i(boolean z4) {
        int i10;
        t7 t7Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.f6 f6Var;
        HashSet l1 = f8.l1(this.f42662c, this.d);
        int i11 = this.f42660a;
        f8 f8Var = this.T;
        if (i11 == 3) {
            f8Var.f41662s = l1.size();
        } else if (i11 == 4) {
            f8Var.f41659f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            t7Var = this.f42668x;
            ArrayList arrayList4 = t7Var.d;
            arrayList = t7Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            n30 n30Var = (n30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(n30Var.getUid()))) {
                arrayList2.add(n30Var);
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
                    if (((n30) arrayList.get(i13)).getUid() == longValue) {
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
                        f6Var = ((org.telegram.ui.ActionBar.g3) f8Var).resourcesProvider;
                        n30 n30Var2 = new n30(context, obj, null, true, f6Var);
                        n30Var2.setOnClickListener(this);
                        arrayList3.add(n30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        kg.j jVar = t7Var.f41383c;
        ArrayList arrayList5 = jVar.e;
        ArrayList arrayList6 = jVar.d;
        ArrayList arrayList7 = jVar.f10433f;
        c8 c8Var = (c8) jVar.f10434n;
        c8Var.D = true;
        ArrayList arrayList8 = c8Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = jVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((n30) arrayList2.get(i14)).setOnClickListener(null);
        }
        jVar.c();
        if (z4) {
            jVar.f10432c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f10431b = animatorSet;
            animatorSet.addListener(new b8(jVar, arrayList2, 0));
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
                n30 n30Var3 = (n30) arrayList2.get(i15);
                arrayList5.add(n30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(n30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(n30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(n30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                n30 n30Var4 = (n30) arrayList3.get(i16);
                arrayList6.add(n30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(n30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(n30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(n30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                jVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            jVar.f10431b = null;
            jVar.f10432c = false;
            c8Var.f41381a.setAllowDrawCursor(true);
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
        t7 t7Var = this.f42668x;
        if (!z4 && !this.R && getTranslationX() == 0.0f) {
            if (!this.K || Math.abs(this.L - c3) > 1.0f) {
                this.K = true;
                ValueAnimator valueAnimator = this.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.M = null;
                }
                float translationY = t7Var.getTranslationY();
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
            t7Var.setTranslationY(c3);
        }
        boolean z11 = this.C;
        rd0 rd0Var = this.B;
        if (!z11) {
            rd0Var.setVisibility(8);
            return;
        }
        rd0Var.setVisibility(0);
        float f11 = -rd0Var.getHeight();
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.f42663f;
            if (i10 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i10);
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
            ((org.telegram.ui.ActionBar.i2) rd0Var.e).c((z10 || this.f42660a != 0) ? 0.0f : 0.0f, true);
        }
        rd0Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f11));
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
        t7 t7Var = this.f42668x;
        if (!t7Var.d.contains(view)) {
            return;
        }
        n30 n30Var = (n30) view;
        if (n30Var.f27182y) {
            t7Var.e = null;
            kg.j jVar = t7Var.f41383c;
            c8 c8Var = (c8) jVar.f10434n;
            c8Var.D = true;
            c8Var.d.remove(n30Var);
            n30Var.setOnClickListener(null);
            jVar.c();
            jVar.f10432c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f10431b = animatorSet;
            animatorSet.addListener(new ex0(18, jVar, n30Var));
            ArrayList arrayList = jVar.h;
            arrayList.clear();
            arrayList.add(n30Var);
            ArrayList arrayList2 = jVar.d;
            arrayList2.clear();
            jVar.e.clear();
            arrayList2.add(n30Var);
            ArrayList arrayList3 = jVar.f10433f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(n30Var, View.ALPHA, 1.0f, 0.0f));
            jVar.requestLayout();
            long uid = n30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f42662c;
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
            n30 n30Var2 = t7Var.e;
            if (n30Var2 != null) {
                n30Var2.a();
                t7Var.e = null;
            }
            t7Var.e = n30Var;
            n30Var.b();
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
        f8 f8Var = this.T;
        i12 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardHeight;
            this.Q = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f42660a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z16 = this.S;
        z4 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
        sl0 sl0Var = this.f42663f;
        x7 x7Var = this.f42665r;
        if (z16 != z4) {
            float c3 = c();
            z10 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
            if (z10 && c3 + Math.min(AndroidUtilities.dp(150.0f), this.f42668x.G) > sl0Var.getPaddingTop()) {
                wh.o oVar = new wh.o(getContext(), 2, 0.7f);
                oVar.f5723a = 1;
                oVar.f46638p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i17 = this.f42660a;
            View view = this.f42666s;
            float f11 = 0.0f;
            if (i17 == 0) {
                z14 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
                if (z14) {
                    f10 = this.Q;
                } else {
                    f10 = 0.0f;
                }
                x7Var.setTranslationY(f10);
                z15 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
                if (z15) {
                    f11 = this.Q;
                }
                view.setTranslationY(f11);
            } else {
                z11 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
                if (z11) {
                    i13 = this.Q;
                } else {
                    i13 = -this.Q;
                }
                float f12 = i13;
                ValueAnimator valueAnimator = x7Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    x7Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                x7Var.d = ofFloat;
                ofFloat.addUpdateListener(new w7(x7Var, 1));
                x7Var.d.addListener(new j2(x7Var, 6));
                x7Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = x7Var.d;
                nr nrVar = org.telegram.ui.ActionBar.r1.f20543w;
                valueAnimator2.setInterpolator(nrVar);
                x7Var.d.start();
                z12 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
                if (z12) {
                    i14 = this.Q;
                } else {
                    i14 = -this.Q;
                }
                view.setTranslationY(i14);
                this.R = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(nrVar).withEndAction(new r7(this, 2)).start();
            }
            z13 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
            this.S = z13;
        }
        sl0Var.setPadding(0, 0, 0, x7Var.getMeasuredHeight());
    }
}
