package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public String C;
    public int D;
    public boolean E;
    public final MediaController.AlbumEntry F;
    public org.telegram.ui.Components.jl0 G;
    public xp0 H;
    public tp0 I;
    public org.telegram.ui.Components.qw0 J;
    public hh.m K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.ActionBar.g1 M;
    public int N;
    public boolean O;
    public final int P;
    public final tn Q;
    public org.telegram.ui.Components.ll0 R;
    public int S;
    public boolean T;
    public boolean U;
    public FrameLayout V;
    public n0 W;
    public op0 X;
    public View Y;
    public org.telegram.ui.Components.au Z;
    public final int f45271a;
    public ImageView f45272a0;
    public final HashMap f45273b;
    public sp0 f45274b0;
    public final ArrayList f45275c;
    public int f45276c0;
    public CharSequence d;
    public final TextPaint f45277d0;
    public boolean f45278e;
    public final RectF f45279e0;
    public final ArrayList f45280f;
    public final Paint f45281f0;
    public AnimatorSet f45282g0;
    public final HashMap h;
    public boolean f45283h0;
    public org.telegram.ui.ActionBar.o1 f45284i0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f45285j0;
    public org.telegram.ui.ActionBar.g1[] f45286k0;
    public String f45287l0;
    public boolean m0;
    public final ArrayList f45288n;
    public final boolean f45289n0;
    public yp0 f45290o0;
    public dq0 f45291p0;
    public final int f45292q0;
    public boolean f45293r;
    public final int f45294r0;
    public boolean f45295s;
    public final int f45296s0;
    public final pp0 f45297t0;
    public String v;
    public String f45298w;
    public int f45299x;
    public int f45300y;

    public zp0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, tn tnVar, boolean z11) {
        super(null);
        this.f45280f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f45288n = new ArrayList();
        this.f45295s = true;
        this.E = true;
        this.N = 100;
        this.f45276c0 = 3;
        this.f45277d0 = new TextPaint(1);
        this.f45279e0 = new RectF();
        this.f45281f0 = new Paint(1);
        this.m0 = true;
        this.f45297t0 = new pp0(this);
        this.F = albumEntry;
        this.f45273b = hashMap;
        this.f45275c = arrayList;
        this.f45271a = i10;
        this.P = i11;
        this.Q = tnVar;
        this.A = z10;
        this.f45289n0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f45288n.add(string);
            }
        }
        if (z11) {
            this.f45292q0 = org.telegram.ui.ActionBar.g6.f23375ug;
            this.f45294r0 = org.telegram.ui.ActionBar.g6.f23143hg;
            this.f45296s0 = org.telegram.ui.ActionBar.g6.f23161ig;
            return;
        }
        this.f45292q0 = org.telegram.ui.ActionBar.g6.f23133h5;
        this.f45294r0 = org.telegram.ui.ActionBar.g6.f23169j5;
        this.f45296s0 = org.telegram.ui.ActionBar.g6.I5;
    }

    public static void U(zp0 zp0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(zp0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(zp0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(zp0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = zp0Var.C;
        zp0Var.C = null;
        zp0Var.d0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.r5 V(zp0 zp0Var, int i10) {
        int childCount = zp0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zp0Var.G.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f45280f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return r5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19614id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f45273b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f45275c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f45278e) {
                h0();
            }
            if (i10 >= 0) {
                if (z10) {
                    ((MediaController.PhotoEntry) obj).reset();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).reset();
                }
                this.f45297t0.W(i10);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    public final void Z() {
        this.f45288n.clear();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        this.J.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z10;
        int i10 = 1;
        if (Y(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(this.f45275c.contains(Integer.valueOf(this.F.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        if (!z10) {
            i10 = 2;
        }
        i0(i10);
        this.f45290o0.a();
    }

    public final void b0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f45280f.clear();
        this.h.clear();
        this.f45295s = true;
        if (this.f45271a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0(obj, "", z10, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.J.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f45288n.size());
        int size = this.f45288n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(j7.l1.k(i10, "recent"), (String) this.f45288n.get(i10));
        }
        edit.commit();
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.U = false;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = this.f45292q0;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = this.f45294r0;
        lVar2.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, this.f45296s0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.f45271a;
        MediaController.AlbumEntry albumEntry = this.F;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 2));
        if (this.f45283h0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new qp0(this));
            this.M = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a10 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a10.F();
            a10.D = new rp0(this);
            this.L = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        }
        if (albumEntry == null) {
            if (i12 == 0) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i12 == 1) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        sp0 sp0Var = new sp0(this, context);
        this.f45274b0 = sp0Var;
        sp0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView = this.f45274b0;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.G = jl0Var;
        jl0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.G.setClipToPadding(false);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.jl0 jl0Var2 = this.G;
        ?? wVar = new f2.w(4);
        this.I = wVar;
        jl0Var2.setLayoutManager(wVar);
        this.I.O = new up0(this);
        this.f45274b0.addView(this.G, i7.f6.e(-1, -1, 51));
        org.telegram.ui.Components.jl0 jl0Var3 = this.G;
        xp0 xp0Var = new xp0(this, context);
        this.H = xp0Var;
        jl0Var3.setAdapter(xp0Var);
        this.G.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.G.setOnItemClickListener(new j(this, 20));
        if (this.D != 1) {
            this.G.setOnItemLongClickListener(new lp0(this, 2));
        }
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(new vp0(this));
        this.R = ll0Var;
        if (this.D != 1) {
            this.G.A.add(ll0Var);
        }
        hh.m mVar = new hh.m(context, 1, getResourceProvider());
        this.K = mVar;
        mVar.setAlpha(0.0f);
        this.K.setVisibility(8);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, this.K, 1, getResourceProvider());
        this.J = qw0Var;
        qw0Var.setAnimateLayoutChange(true);
        this.J.d.setTypeface(Typeface.DEFAULT);
        this.J.d.setTextSize(1, 16.0f);
        this.J.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23433y6));
        this.J.addView(this.K, 0);
        if (albumEntry != null) {
            this.J.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.J.e(false, false);
        this.f45274b0.addView(this.J, i7.f6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.G.setOnScrollListener(new np0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.m0) {
            View view = new View(context);
            this.Y = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Y.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f45274b0.addView(this.Y, i7.f6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.V = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            this.V.setVisibility(4);
            this.V.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f45274b0.addView(this.V, i7.f6.e(-1, 48, 83));
            this.V.setOnTouchListener(new mh.d(2));
            org.telegram.ui.Components.au auVar = this.Z;
            if (auVar != null) {
                auVar.o();
            }
            this.Z = new org.telegram.ui.Components.au(context, this.f45274b0, null, 1, false, null);
            this.Z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.Z.setHint(LocaleController.getString(R.string.AddCaption));
            this.Z.s();
            org.telegram.ui.Components.st editText = this.Z.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.V.addView(this.Z, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.Z.setText(charSequence);
            }
            this.Z.getEditText().addTextChangedListener(new p0(this, 14));
            n0 n0Var = new n0(this, context, 17);
            this.W = n0Var;
            n0Var.setFocusable(true);
            this.W.setFocusableInTouchMode(true);
            this.W.setVisibility(4);
            this.W.setScaleX(0.2f);
            this.W.setScaleY(0.2f);
            this.W.setAlpha(0.0f);
            this.f45274b0.addView(this.W, i7.f6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f45272a0 = new ImageView(context);
            this.f45272a0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T5, false)));
            this.f45272a0.setImageResource(R.drawable.attach_send);
            this.f45272a0.setImportantForAccessibility(2);
            this.f45272a0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.f45272a0.setScaleType(ImageView.ScaleType.CENTER);
            this.f45272a0.setOutlineProvider(new eg.k1(18));
            this.W.addView(this.f45272a0, i7.f6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f45272a0.setOnClickListener(new t50(this, 19));
            this.f45272a0.setOnLongClickListener(new w(this, 4));
            TextPaint textPaint = this.f45277d0;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            op0 op0Var = new op0(this, context, 0);
            this.X = op0Var;
            op0Var.setAlpha(0.0f);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.f45274b0.addView(this.X, i7.f6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.P != 0) {
                this.Z.setVisibility(8);
            }
        }
        if ((albumEntry != null || i12 == 0 || i12 == 1) && this.E) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45278e = z10;
        this.G.setEmptyView(this.J);
        org.telegram.ui.Components.jl0 jl0Var4 = this.G;
        jl0Var4.U1 = true;
        jl0Var4.V1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f45293r) {
            this.f45293r = false;
            if (this.f45299x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45299x, true);
                this.f45299x = 0;
            }
        }
        this.C = str;
        this.f45293r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        if (z10) {
            str3 = messagesController2.gifSearchBot;
        } else {
            str3 = messagesController2.imageSearchBot;
        }
        TLObject userOrChat = messagesController.getUserOrChat(str3);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z11 && !this.B) {
                this.B = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                if (z10) {
                    str5 = messagesController3.gifSearchBot;
                } else {
                    str5 = messagesController3.imageSearchBot;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new nh.l3(11, this, z10));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        tn tnVar = this.Q;
        if (tnVar != null) {
            long a2 = tnVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.f45300y + 1;
        this.f45300y = i10;
        this.f45299x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.rb(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f45299x, this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z10) {
        HashMap hashMap = this.f45273b;
        if (!hashMap.isEmpty() && this.f45290o0 != null && !this.O) {
            org.telegram.ui.Components.au auVar = this.Z;
            if (auVar != null && auVar.f26882a.length() > 0) {
                Object obj = hashMap.get(this.f45275c.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj).caption = this.Z.getText().toString();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).caption = this.Z.getText().toString();
                }
            }
            this.O = true;
            this.f45290o0.h(i10, false, z10);
            if (this.P != 2) {
                yp0 yp0Var = this.f45290o0;
                if (yp0Var == null || yp0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void f0(int i10, boolean z10) {
        this.D = i10;
        this.E = z10;
        if (i10 > 0 && this.f45271a == 1) {
            this.D = 1;
        }
    }

    public final boolean g0(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        float f9;
        float f10;
        float f11;
        float f12;
        float dp;
        float f13;
        float f14;
        float f15;
        float f16;
        float dp2;
        if (this.Z != null) {
            if (this.V.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f45282g0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.V;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.Z.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.Z.getEditText());
                }
                this.Z.k(true);
                if (z10) {
                    this.V.setVisibility(0);
                    this.W.setVisibility(0);
                }
                float f17 = 0.0f;
                float f18 = 0.2f;
                float f19 = 1.0f;
                if (z11) {
                    this.f45282g0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    n0 n0Var = this.W;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n0Var, property, f13));
                    n0 n0Var2 = this.W;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n0Var2, property2, f14));
                    n0 n0Var3 = this.W;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n0Var3, property3, f15));
                    op0 op0Var = this.X;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(op0Var, property, f16));
                    op0 op0Var2 = this.X;
                    if (z10) {
                        f18 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(op0Var2, property2, f18));
                    op0 op0Var3 = this.X;
                    if (!z10) {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(op0Var3, property3, f19));
                    FrameLayout frameLayout2 = this.V;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, dp2));
                    View view = this.Y;
                    if (!z10) {
                        f17 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f17));
                    this.f45282g0.playTogether(arrayList);
                    this.f45282g0.setInterpolator(new DecelerateInterpolator());
                    this.f45282g0.setDuration(180L);
                    this.f45282g0.addListener(new p60(3, this, z10));
                    this.f45282g0.start();
                    return true;
                }
                n0 n0Var4 = this.W;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.2f;
                }
                n0Var4.setScaleX(f9);
                n0 n0Var5 = this.W;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                n0Var5.setScaleY(f10);
                n0 n0Var6 = this.W;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n0Var6.setAlpha(f11);
                op0 op0Var4 = this.X;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.2f;
                }
                op0Var4.setScaleX(f12);
                op0 op0Var5 = this.X;
                if (z10) {
                    f18 = 1.0f;
                }
                op0Var5.setScaleY(f18);
                op0 op0Var6 = this.X;
                if (!z10) {
                    f19 = 0.0f;
                }
                op0Var6.setAlpha(f19);
                FrameLayout frameLayout3 = this.V;
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                frameLayout3.setTranslationY(dp);
                View view2 = this.Y;
                if (!z10) {
                    f17 = AndroidUtilities.dp(48.0f);
                }
                view2.setTranslationY(f17);
                if (!z10) {
                    this.V.setVisibility(4);
                    this.W.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45274b0, 1, null, null, null, null, this.f45292q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, this.f45292q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, this.f45294r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, this.f45294r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, this.f45296s0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, this.f45294r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 16777216, null, null, null, null, this.f45294r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 32768, null, null, null, null, this.f45292q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    public final void h0() {
        boolean z10;
        if (this.f45278e) {
            int childCount = this.G.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.G.getChildAt(i10);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.r5;
                MediaController.AlbumEntry albumEntry = this.F;
                ArrayList arrayList = this.f45275c;
                if (z11) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i11 = -1;
                    if (albumEntry != null) {
                        MediaController.PhotoEntry photoEntry = albumEntry.photos.get(num.intValue());
                        if (this.f45278e) {
                            i11 = arrayList.indexOf(Integer.valueOf(photoEntry.imageId));
                        }
                        r5Var.setNum(i11);
                    } else {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) this.f45280f.get(num.intValue());
                        if (this.f45278e) {
                            i11 = arrayList.indexOf(searchImage.f19614id);
                        }
                        r5Var.setNum(i11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g7Var.b(z10, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        boolean z10;
        float f9;
        boolean z11 = true;
        if (this.f45273b.size() == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            if (i10 == 0) {
                z11 = false;
            }
            g0(false, z11);
            return;
        }
        this.X.invalidate();
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!g0(true, z10) && i10 != 0) {
            this.X.setPivotX(AndroidUtilities.dp(21.0f));
            this.X.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            op0 op0Var = this.X;
            Property property = View.SCALE_X;
            float f10 = 0.9f;
            if (i10 == 1) {
                f9 = 1.1f;
            } else {
                f9 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(op0Var, property, f9, 1.0f);
            op0 op0Var2 = this.X;
            Property property2 = View.SCALE_Y;
            if (i10 == 1) {
                f10 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(op0Var2, property2, f10, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0() {
        String str;
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        if (!this.f45293r && (this.f45288n.size() <= 0 || ((str = this.v) != null && !TextUtils.isEmpty(str)))) {
            this.J.e(false, true);
        } else {
            this.J.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar != null && auVar.f26885e) {
            if (z10) {
                auVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.f45299x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45299x, true);
            this.f45299x = 0;
        }
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar != null) {
            auVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f9) {
        org.telegram.ui.Components.jl0 jl0Var = this.G;
        if (jl0Var == null) {
            return;
        }
        if (this.Z.f26885e) {
            this.fragmentView.setTranslationY(f9);
            this.G.setTranslationY(0.0f);
            return;
        }
        jl0Var.setTranslationY(f9);
    }

    @Override
    public final void onResume() {
        super.onResume();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar != null) {
            auVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            w0Var.z(true);
            if (!TextUtils.isEmpty(this.f45287l0)) {
                this.L.H(this.f45287l0, false);
                this.f45287l0 = null;
                b0(this.L.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (z10 && (w0Var = this.L) != null) {
            AndroidUtilities.showKeyboard(w0Var.getSearchField());
        }
    }
}
