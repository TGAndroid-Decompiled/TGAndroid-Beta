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
    public org.telegram.ui.Components.wk0 G;
    public xp0 H;
    public tp0 I;
    public org.telegram.ui.Components.gw0 J;
    public eh.o K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.ActionBar.g1 M;
    public int N;
    public boolean O;
    public final int P;
    public final qn Q;
    public org.telegram.ui.Components.yk0 R;
    public int S;
    public boolean T;
    public boolean U;
    public FrameLayout V;
    public m0 W;
    public yi0 X;
    public View Y;
    public org.telegram.ui.Components.ut Z;
    public final int f45206a;
    public ImageView f45207a0;
    public final HashMap f45208b;
    public sp0 f45209b0;
    public final ArrayList f45210c;
    public int f45211c0;
    public CharSequence d;
    public final TextPaint f45212d0;
    public boolean f45213e;
    public final RectF f45214e0;
    public final ArrayList f45215f;
    public final Paint f45216f0;
    public AnimatorSet f45217g0;
    public final HashMap h;
    public boolean f45218h0;
    public org.telegram.ui.ActionBar.o1 f45219i0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f45220j0;
    public org.telegram.ui.ActionBar.g1[] f45221k0;
    public String f45222l0;
    public boolean m0;
    public final ArrayList f45223n;
    public final boolean f45224n0;
    public yp0 f45225o0;
    public dq0 f45226p0;
    public final int f45227q0;
    public boolean f45228r;
    public final int f45229r0;
    public boolean f45230s;
    public final int f45231s0;
    public final pp0 f45232t0;
    public String v;
    public String f45233w;
    public int f45234x;
    public int f45235y;

    public zp0(int i9, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, qn qnVar, boolean z11) {
        super(null);
        this.f45215f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f45223n = new ArrayList();
        this.f45230s = true;
        this.E = true;
        this.N = 100;
        this.f45211c0 = 3;
        this.f45212d0 = new TextPaint(1);
        this.f45214e0 = new RectF();
        this.f45216f0 = new Paint(1);
        this.m0 = true;
        this.f45232t0 = new pp0(this);
        this.F = albumEntry;
        this.f45208b = hashMap;
        this.f45210c = arrayList;
        this.f45206a = i9;
        this.P = i10;
        this.Q = qnVar;
        this.A = z10;
        this.f45224n0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.f45223n.add(string);
            }
        }
        if (z11) {
            this.f45227q0 = org.telegram.ui.ActionBar.f6.f23313ug;
            this.f45229r0 = org.telegram.ui.ActionBar.f6.f23083hg;
            this.f45231s0 = org.telegram.ui.ActionBar.f6.f23100ig;
            return;
        }
        this.f45227q0 = org.telegram.ui.ActionBar.f6.f23072h5;
        this.f45229r0 = org.telegram.ui.ActionBar.f6.f23108j5;
        this.f45231s0 = org.telegram.ui.ActionBar.f6.I5;
    }

    public static void T(zp0 zp0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(zp0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(zp0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(zp0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = zp0Var.C;
        zp0Var.C = null;
        zp0Var.c0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.t5 U(zp0 zp0Var, int i9) {
        int childCount = zp0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zp0Var.G.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f45215f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i9) {
                        return t5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int X(int i9, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19643id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f45208b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f45210c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f45213e) {
                g0();
            }
            if (i9 >= 0) {
                if (z10) {
                    ((MediaController.PhotoEntry) obj).reset();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).reset();
                }
                this.f45232t0.W(i9);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    public final void Y() {
        this.f45223n.clear();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        this.J.e(false, true);
        b0();
    }

    public final void Z(View view, Object obj) {
        boolean z10;
        int i9 = 1;
        if (X(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(this.f45210c.contains(Integer.valueOf(this.F.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        if (!z10) {
            i9 = 2;
        }
        h0(i9);
        this.f45225o0.a();
    }

    public final void a0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f45215f.clear();
        this.h.clear();
        this.f45230s = true;
        if (this.f45206a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0(obj, "", z10, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.J.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        i0();
    }

    public final void b0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f45223n.size());
        int size = this.f45223n.size();
        for (int i9 = 0; i9 < size; i9++) {
            edit.putString(j3.r0.l(i9, "recent"), (String) this.f45223n.get(i9));
        }
        edit.commit();
    }

    public final void c0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f45228r) {
            this.f45228r = false;
            if (this.f45234x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45234x, true);
                this.f45234x = 0;
            }
        }
        this.C = str;
        this.f45228r = true;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new kh.o3(11, this, z10));
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
        qn qnVar = this.Q;
        if (qnVar != null) {
            long a2 = qnVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i9 = this.f45235y + 1;
        this.f45235y = i9;
        this.f45234x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.lb(this, str, i9, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f45234x, this.classGuid);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.U = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = this.f45227q0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.f45229r0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, this.f45231s0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.f45206a;
        MediaController.AlbumEntry albumEntry = this.F;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 10));
        if (this.f45218h0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new qp0(this));
            this.M = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a3 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a3.F();
            a3.D = new rp0(this);
            this.L = a3;
            EditTextBoldCursor searchField = a3.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vd, false));
        }
        if (albumEntry == null) {
            if (i11 == 0) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i11 == 1) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        sp0 sp0Var = new sp0(this, context);
        this.f45209b0 = sp0Var;
        sp0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.fragmentView = this.f45209b0;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.G = wk0Var;
        wk0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.G.setClipToPadding(false);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.wk0 wk0Var2 = this.G;
        ?? yVar = new f2.y(4);
        this.I = yVar;
        wk0Var2.setLayoutManager(yVar);
        this.I.O = new up0(this);
        this.f45209b0.addView(this.G, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.wk0 wk0Var3 = this.G;
        xp0 xp0Var = new xp0(this, context);
        this.H = xp0Var;
        wk0Var3.setAdapter(xp0Var);
        this.G.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.G.setOnItemClickListener(new i(this, 20));
        if (this.D != 1) {
            this.G.setOnItemLongClickListener(new mp0(this, 2));
        }
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(new vp0(this));
        this.R = yk0Var;
        if (this.D != 1) {
            this.G.A.add(yk0Var);
        }
        eh.o oVar = new eh.o(context, 1, getResourceProvider());
        this.K = oVar;
        oVar.setAlpha(0.0f);
        this.K.setVisibility(8);
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, this.K, 1, getResourceProvider());
        this.J = gw0Var;
        gw0Var.setAnimateLayoutChange(true);
        this.J.d.setTypeface(Typeface.DEFAULT);
        this.J.d.setTextSize(1, 16.0f);
        this.J.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
        this.J.addView(this.K, 0);
        if (albumEntry != null) {
            this.J.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.J.e(false, false);
        this.f45209b0.addView(this.J, g7.e6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.G.setOnScrollListener(new op0(this));
        if (albumEntry == null) {
            i0();
        }
        if (this.m0) {
            View view = new View(context);
            this.Y = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Y.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f45209b0.addView(this.Y, g7.e6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.V = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            this.V.setVisibility(4);
            this.V.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f45209b0.addView(this.V, g7.e6.e(-1, 48, 83));
            this.V.setOnTouchListener(new jh.d(2));
            org.telegram.ui.Components.ut utVar = this.Z;
            if (utVar != null) {
                utVar.o();
            }
            this.Z = new org.telegram.ui.Components.ut(context, this.f45209b0, null, 1, false, null);
            this.Z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.Z.setHint(LocaleController.getString(R.string.AddCaption));
            this.Z.s();
            org.telegram.ui.Components.mt editText = this.Z.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.V.addView(this.Z, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.Z.setText(charSequence);
            }
            this.Z.getEditText().addTextChangedListener(new o0(this, 14));
            m0 m0Var = new m0(this, context, 17);
            this.W = m0Var;
            m0Var.setFocusable(true);
            this.W.setFocusableInTouchMode(true);
            this.W.setVisibility(4);
            this.W.setScaleX(0.2f);
            this.W.setScaleY(0.2f);
            this.W.setAlpha(0.0f);
            this.f45209b0.addView(this.W, g7.e6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f45207a0 = new ImageView(context);
            this.f45207a0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.S5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.T5, false)));
            this.f45207a0.setImageResource(R.drawable.attach_send);
            this.f45207a0.setImportantForAccessibility(2);
            this.f45207a0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.f45207a0.setScaleType(ImageView.ScaleType.CENTER);
            this.f45207a0.setOutlineProvider(new bg.q1(18));
            this.W.addView(this.f45207a0, g7.e6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f45207a0.setOnClickListener(new q50(this, 19));
            this.f45207a0.setOnLongClickListener(new u(this, 4));
            TextPaint textPaint = this.f45212d0;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            yi0 yi0Var = new yi0(this, context, 2);
            this.X = yi0Var;
            yi0Var.setAlpha(0.0f);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.f45209b0.addView(this.X, g7.e6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.P != 0) {
                this.Z.setVisibility(8);
            }
        }
        if ((albumEntry != null || i11 == 0 || i11 == 1) && this.E) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45213e = z10;
        this.G.setEmptyView(this.J);
        org.telegram.ui.Components.wk0 wk0Var4 = this.G;
        wk0Var4.U1 = true;
        wk0Var4.V1 = 0;
        h0(0);
        return this.fragmentView;
    }

    public final void d0(int i9, boolean z10) {
        HashMap hashMap = this.f45208b;
        if (!hashMap.isEmpty() && this.f45225o0 != null && !this.O) {
            org.telegram.ui.Components.ut utVar = this.Z;
            if (utVar != null && utVar.f33121a.length() > 0) {
                Object obj = hashMap.get(this.f45210c.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj).caption = this.Z.getText().toString();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).caption = this.Z.getText().toString();
                }
            }
            this.O = true;
            this.f45225o0.i(i9, false, z10);
            if (this.P != 2) {
                yp0 yp0Var = this.f45225o0;
                if (yp0Var == null || yp0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i9, boolean z10) {
        this.D = i9;
        this.E = z10;
        if (i9 > 0 && this.f45206a == 1) {
            this.D = 1;
        }
    }

    public final boolean f0(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        float f14;
        float f15;
        float f16;
        float f17;
        float dp2;
        if (this.Z != null) {
            if (this.V.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f45217g0;
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
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z11) {
                    this.f45217g0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    m0 m0Var = this.W;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(m0Var, property, f14));
                    m0 m0Var2 = this.W;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(m0Var2, property2, f15));
                    m0 m0Var3 = this.W;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(m0Var3, property3, f16));
                    yi0 yi0Var = this.X;
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(yi0Var, property, f17));
                    yi0 yi0Var2 = this.X;
                    if (z10) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(yi0Var2, property2, f19));
                    yi0 yi0Var3 = this.X;
                    if (!z10) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(yi0Var3, property3, f20));
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
                        f18 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f45217g0.playTogether(arrayList);
                    this.f45217g0.setInterpolator(new DecelerateInterpolator());
                    this.f45217g0.setDuration(180L);
                    this.f45217g0.addListener(new n60(3, this, z10));
                    this.f45217g0.start();
                    return true;
                }
                m0 m0Var4 = this.W;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                m0Var4.setScaleX(f10);
                m0 m0Var5 = this.W;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                m0Var5.setScaleY(f11);
                m0 m0Var6 = this.W;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                m0Var6.setAlpha(f12);
                yi0 yi0Var4 = this.X;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                yi0Var4.setScaleX(f13);
                yi0 yi0Var5 = this.X;
                if (z10) {
                    f19 = 1.0f;
                }
                yi0Var5.setScaleY(f19);
                yi0 yi0Var6 = this.X;
                if (!z10) {
                    f20 = 0.0f;
                }
                yi0Var6.setAlpha(f20);
                FrameLayout frameLayout3 = this.V;
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                frameLayout3.setTranslationY(dp);
                View view2 = this.Y;
                if (!z10) {
                    f18 = AndroidUtilities.dp(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z10) {
                    this.V.setVisibility(4);
                    this.W.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void g0() {
        boolean z10;
        if (this.f45213e) {
            int childCount = this.G.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = this.G.getChildAt(i9);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.t5;
                MediaController.AlbumEntry albumEntry = this.F;
                ArrayList arrayList = this.f45210c;
                if (z11) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i10 = -1;
                    if (albumEntry != null) {
                        MediaController.PhotoEntry photoEntry = albumEntry.photos.get(num.intValue());
                        if (this.f45213e) {
                            i10 = arrayList.indexOf(Integer.valueOf(photoEntry.imageId));
                        }
                        t5Var.setNum(i10);
                    } else {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) this.f45215f.get(num.intValue());
                        if (this.f45213e) {
                            i10 = arrayList.indexOf(searchImage.f19643id);
                        }
                        t5Var.setNum(i10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i7Var.b(z10, false);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f45209b0, 1, null, null, null, null, this.f45227q0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, this.f45227q0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, this.f45229r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, this.f45229r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, this.f45231s0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, this.f45229r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 16777216, null, null, null, null, this.f45229r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 32768, null, null, null, null, this.f45227q0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.R4}, null, org.telegram.ui.ActionBar.f6.f23004da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.f6.X9));
        return arrayList;
    }

    public final void h0(int i9) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (this.f45208b.size() == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            if (i9 == 0) {
                z11 = false;
            }
            f0(false, z11);
            return;
        }
        this.X.invalidate();
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!f0(true, z10) && i9 != 0) {
            this.X.setPivotX(AndroidUtilities.dp(21.0f));
            this.X.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            yi0 yi0Var = this.X;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i9 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yi0Var, property, f10, 1.0f);
            yi0 yi0Var2 = this.X;
            Property property2 = View.SCALE_Y;
            if (i9 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(yi0Var2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
    }

    public final void i0() {
        String str;
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        if (!this.f45228r && (this.f45223n.size() <= 0 || ((str = this.v) != null && !TextUtils.isEmpty(str)))) {
            this.J.e(false, true);
        } else {
            this.J.e(true, true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar != null && utVar.f33124e) {
            if (z10) {
                utVar.k(true);
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
        if (this.f45234x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45234x, true);
            this.f45234x = 0;
        }
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar != null) {
            utVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.wk0 wk0Var = this.G;
        if (wk0Var == null) {
            return;
        }
        if (this.Z.f33124e) {
            this.fragmentView.setTranslationY(f10);
            this.G.setTranslationY(0.0f);
            return;
        }
        wk0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar != null) {
            utVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            w0Var.z(true);
            if (!TextUtils.isEmpty(this.f45222l0)) {
                this.L.H(this.f45222l0, false);
                this.f45222l0 = null;
                a0(this.L.getSearchField());
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
