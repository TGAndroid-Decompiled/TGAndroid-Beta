package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import java.util.HashSet;
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
public final class rq0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final MediaController.AlbumEntry J;
    public org.telegram.ui.Components.mm0 K;
    public pq0 L;
    public kq0 M;
    public org.telegram.ui.Components.ey0 N;
    public nq0 O;
    public org.telegram.ui.ActionBar.w0 P;
    public org.telegram.ui.ActionBar.g1 Q;
    public int R;
    public boolean S;
    public final int T;
    public final un U;
    public org.telegram.ui.Components.qm0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int f43242a;
    public k0 f43243a0;
    public final HashMap f43244b;
    public z10 f43245b0;
    public final ArrayList f43246c;
    public View f43247c0;
    public CharSequence d;
    public org.telegram.ui.Components.ru f43248d0;
    public boolean e;
    public ImageView f43249e0;
    public final ArrayList f43250f;
    public jq0 f43251f0;
    public int f43252g0;
    public final HashMap h;
    public final TextPaint f43253h0;
    public final RectF f43254i0;
    public final Paint f43255j0;
    public AnimatorSet f43256k0;
    public boolean f43257l0;
    public org.telegram.ui.ActionBar.o1 m0;
    public final ArrayList f43258n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f43259n0;
    public org.telegram.ui.ActionBar.g1[] f43260o0;
    public String f43261p0;
    public boolean f43262q0;
    public boolean f43263r;
    public final boolean f43264r0;
    public boolean f43265s;
    public qq0 f43266s0;
    public uq0 f43267t0;
    public final int f43268u0;
    public String v;
    public final int f43269v0;
    public String f43270w;
    public final int f43271w0;
    public int f43272x;
    public final gq0 f43273x0;
    public int f43274y;

    public rq0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, un unVar, boolean z11) {
        super(null);
        this.f43250f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f43258n = new ArrayList();
        this.f43265s = true;
        this.I = true;
        this.R = 100;
        this.f43252g0 = 3;
        this.f43253h0 = new TextPaint(1);
        this.f43254i0 = new RectF();
        this.f43255j0 = new Paint(1);
        this.f43262q0 = true;
        this.f43273x0 = new gq0(this);
        this.J = albumEntry;
        this.f43244b = hashMap;
        this.f43246c = arrayList;
        this.f43242a = i10;
        this.T = i11;
        this.U = unVar;
        this.E = z10;
        this.f43264r0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f43258n.add(string);
            }
        }
        if (z11) {
            this.f43268u0 = org.telegram.ui.ActionBar.y6.f23683ug;
            this.f43269v0 = org.telegram.ui.ActionBar.y6.f23438hg;
            this.f43271w0 = org.telegram.ui.ActionBar.y6.f23455ig;
            return;
        }
        this.f43268u0 = org.telegram.ui.ActionBar.y6.f23427h5;
        this.f43269v0 = org.telegram.ui.ActionBar.y6.f23464j5;
        this.f43271w0 = org.telegram.ui.ActionBar.y6.I5;
    }

    public static void V(rq0 rq0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(rq0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(rq0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(rq0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = rq0Var.G;
        rq0Var.G = null;
        rq0Var.e0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.x5 W(rq0 rq0Var, int i10) {
        int childCount = rq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rq0Var.K.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                int intValue = ((Integer) x5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = rq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= rq0Var.f43250f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return x5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Z(int i10, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19543id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f43244b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f43246c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.e) {
                i0();
            }
            if (i10 >= 0) {
                if (z10) {
                    ((MediaController.PhotoEntry) obj).reset();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).reset();
                }
                this.f43273x0.X(i10);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    public final void a0() {
        this.f43258n.clear();
        pq0 pq0Var = this.L;
        if (pq0Var != null) {
            pq0Var.l();
        }
        this.N.e(false, true);
        d0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23360da));
    }

    public final void b0(View view, Object obj) {
        boolean z10;
        int i10 = 1;
        if (Z(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(this.f43246c.contains(Integer.valueOf(this.J.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        if (!z10) {
            i10 = 2;
        }
        j0(i10);
        this.f43266s0.a();
    }

    public final void c0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f43250f.clear();
        this.h.clear();
        this.f43265s = true;
        if (this.f43242a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0(obj, "", z10, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.N.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        k0();
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Y = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = this.f43268u0;
        org.telegram.ui.ActionBar.f7.i(i10, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = this.f43269v0;
        org.telegram.ui.ActionBar.f7.m(kVar2, 5, i11, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, this.f43271w0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.f43242a;
        MediaController.AlbumEntry albumEntry = this.J;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 21));
        if (this.f43257l0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new hq0(this));
            this.Q = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a10 = this.actionBar.l().a(0, R.drawable.outline_header_search);
            a10.N();
            a10.H = new iq0(this);
            this.P = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            org.telegram.ui.ActionBar.f7.V(searchField, i11, null);
            org.telegram.ui.ActionBar.f7.w(searchField, i11, null);
            org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Vd, null);
        }
        if (albumEntry == null) {
            if (i12 == 0) {
                this.P.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i12 == 1) {
                this.P.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        jq0 jq0Var = new jq0(this, context);
        this.f43251f0 = jq0Var;
        org.telegram.ui.ActionBar.f7.i(i10, jq0Var, null);
        this.fragmentView = this.f43251f0;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.K = mm0Var;
        mm0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.mm0 mm0Var2 = this.K;
        ?? tVar = new s4.t(4);
        this.M = tVar;
        mm0Var2.setLayoutManager(tVar);
        this.M.O = new lq0(this);
        this.f43251f0.addView(this.K, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var3 = this.K;
        pq0 pq0Var = new pq0(this, context);
        this.L = pq0Var;
        mm0Var3.setAdapter(pq0Var);
        org.telegram.ui.ActionBar.f7.I(this.K, i10, null);
        this.K.setOnItemClickListener(new h(this, 22));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new eq0(this, 2));
        }
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(new mq0(this));
        this.V = qm0Var;
        if (this.H != 1) {
            this.K.E.add(qm0Var);
        }
        nq0 nq0Var = new nq0(context, 0, getResourceProvider());
        this.O = nq0Var;
        nq0Var.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, this.O, 1, getResourceProvider());
        this.N = ey0Var;
        ey0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(this.N.d, org.telegram.ui.ActionBar.y6.f23748y6, getResourceProvider());
        this.N.addView(this.O, 0);
        if (albumEntry != null) {
            this.N.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.N.e(false, false);
        this.f43251f0.addView(this.N, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new fq0(this));
        if (albumEntry == null) {
            k0();
        }
        if (this.f43262q0) {
            View view = new View(context);
            this.f43247c0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.f43247c0.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f43251f0.addView(this.f43247c0, org.telegram.ui.Components.gb1.h(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            org.telegram.ui.ActionBar.f7.i(i10, frameLayout, null);
            this.Z.setVisibility(4);
            this.Z.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f43251f0.addView(this.Z, org.telegram.ui.Components.gb1.i(-1, 48, 83));
            this.Z.setOnTouchListener(new ei.d(2));
            org.telegram.ui.Components.ru ruVar = this.f43248d0;
            if (ruVar != null) {
                ruVar.o();
            }
            this.f43248d0 = new org.telegram.ui.Components.ru(context, this.f43251f0, null, 1, false, null);
            this.f43248d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.f43248d0.setHint(LocaleController.getString(R.string.AddCaption));
            this.f43248d0.s();
            org.telegram.ui.Components.ju editText = this.f43248d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.f43248d0, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f43248d0.setText(charSequence);
            }
            this.f43248d0.getEditText().addTextChangedListener(new m0(this, 14));
            k0 k0Var = new k0(this, context, 18);
            this.f43243a0 = k0Var;
            k0Var.setFocusable(true);
            this.f43243a0.setFocusableInTouchMode(true);
            this.f43243a0.setVisibility(4);
            this.f43243a0.setScaleX(0.2f);
            this.f43243a0.setScaleY(0.2f);
            this.f43243a0.setAlpha(0.0f);
            this.f43251f0.addView(this.f43243a0, org.telegram.ui.Components.gb1.h(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f43249e0 = new ImageView(context);
            this.f43249e0.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.S5, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T5, false)));
            this.f43249e0.setImageResource(R.drawable.attach_send);
            this.f43249e0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.f7.t(this.f43249e0, org.telegram.ui.ActionBar.y6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f43249e0.setScaleType(ImageView.ScaleType.CENTER);
            this.f43249e0.setOutlineProvider(new ag.v0(22));
            this.f43243a0.addView(this.f43249e0, org.telegram.ui.Components.gb1.h(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f43249e0.setOnClickListener(new x50(this, 20));
            this.f43249e0.setOnLongClickListener(new t(this, 4));
            TextPaint textPaint = this.f43253h0;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            z10 z10Var = new z10(this, context, 4);
            this.f43245b0 = z10Var;
            z10Var.setAlpha(0.0f);
            this.f43245b0.setScaleX(0.2f);
            this.f43245b0.setScaleY(0.2f);
            this.f43251f0.addView(this.f43245b0, org.telegram.ui.Components.gb1.h(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.f43248d0.setVisibility(8);
            }
        }
        if ((albumEntry != null || i12 == 0 || i12 == 1) && this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.mm0 mm0Var4 = this.K;
        mm0Var4.W1 = true;
        mm0Var4.X1 = 0;
        j0(0);
        return this.fragmentView;
    }

    public final void d0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f43258n.size());
        int size = this.f43258n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(ic.a.i(i10, "recent"), (String) this.f43258n.get(i10));
        }
        edit.commit();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f43263r) {
            this.f43263r = false;
            if (this.f43272x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f43272x, true);
                this.f43272x = 0;
            }
        }
        this.G = str;
        this.f43263r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        if (z10) {
            str3 = messagesController2.gifSearchBot;
        } else {
            str3 = messagesController2.imageSearchBot;
        }
        TLObject userOrChat = messagesController.getUserOrChat(str3);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z11 && !this.F) {
                this.F = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                if (z10) {
                    str5 = messagesController3.gifSearchBot;
                } else {
                    str5 = messagesController3.imageSearchBot;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new fi.m3(11, this, z10));
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
        un unVar = this.U;
        if (unVar != null) {
            long a2 = unVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.f43274y + 1;
        this.f43274y = i10;
        this.f43272x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.ac(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f43272x, this.classGuid);
    }

    public final void f0(int i10, boolean z10) {
        HashMap hashMap = this.f43244b;
        if (!hashMap.isEmpty() && this.f43266s0 != null && !this.S) {
            org.telegram.ui.Components.ru ruVar = this.f43248d0;
            if (ruVar != null && ruVar.f32325a.length() > 0) {
                Object obj = hashMap.get(this.f43246c.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj).caption = this.f43248d0.getText().toString();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).caption = this.f43248d0.getText().toString();
                }
            }
            this.S = true;
            this.f43266s0.d(i10, false, z10);
            if (this.T != 2) {
                qq0 qq0Var = this.f43266s0;
                if (qq0Var == null || qq0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void g0(int i10, boolean z10) {
        this.H = i10;
        this.I = z10;
        if (i10 > 0 && this.f43242a == 1) {
            this.H = 1;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43251f0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43268u0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43268u0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43269v0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43269v0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43271w0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43269v0));
        org.telegram.ui.ActionBar.w0 w0Var = this.P;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43269v0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f43268u0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.X9));
        return arrayList;
    }

    public final boolean h0(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        float f13;
        float f14;
        float f15;
        float f16;
        float dp2;
        if (this.f43248d0 != null) {
            if (this.Z.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f43256k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.Z;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f43248d0.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.f43248d0.getEditText());
                }
                this.f43248d0.k(true);
                if (z10) {
                    this.Z.setVisibility(0);
                    this.f43243a0.setVisibility(0);
                }
                float f17 = 0.0f;
                float f18 = 0.2f;
                float f19 = 1.0f;
                if (z11) {
                    this.f43256k0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    k0 k0Var = this.f43243a0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f13));
                    k0 k0Var2 = this.f43243a0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, f14));
                    k0 k0Var3 = this.f43243a0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var3, property3, f15));
                    z10 z10Var = this.f43245b0;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z10Var, property, f16));
                    z10 z10Var2 = this.f43245b0;
                    if (z10) {
                        f18 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z10Var2, property2, f18));
                    z10 z10Var3 = this.f43245b0;
                    if (!z10) {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(z10Var3, property3, f19));
                    FrameLayout frameLayout2 = this.Z;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, dp2));
                    View view = this.f43247c0;
                    if (!z10) {
                        f17 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f17));
                    this.f43256k0.playTogether(arrayList);
                    this.f43256k0.setInterpolator(new DecelerateInterpolator());
                    this.f43256k0.setDuration(180L);
                    this.f43256k0.addListener(new q40(4, this, z10));
                    this.f43256k0.start();
                    return true;
                }
                k0 k0Var4 = this.f43243a0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                k0Var4.setScaleX(f7);
                k0 k0Var5 = this.f43243a0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                k0Var5.setScaleY(f10);
                k0 k0Var6 = this.f43243a0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k0Var6.setAlpha(f11);
                z10 z10Var4 = this.f43245b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.2f;
                }
                z10Var4.setScaleX(f12);
                z10 z10Var5 = this.f43245b0;
                if (z10) {
                    f18 = 1.0f;
                }
                z10Var5.setScaleY(f18);
                z10 z10Var6 = this.f43245b0;
                if (!z10) {
                    f19 = 0.0f;
                }
                z10Var6.setAlpha(f19);
                FrameLayout frameLayout3 = this.Z;
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                frameLayout3.setTranslationY(dp);
                View view2 = this.f43247c0;
                if (!z10) {
                    f17 = AndroidUtilities.dp(48.0f);
                }
                view2.setTranslationY(f17);
                if (!z10) {
                    this.Z.setVisibility(4);
                    this.f43243a0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void i0() {
        boolean z10;
        if (this.e) {
            int childCount = this.K.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.K.getChildAt(i10);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.x5;
                MediaController.AlbumEntry albumEntry = this.J;
                ArrayList arrayList = this.f43246c;
                if (z11) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i11 = -1;
                    if (albumEntry != null) {
                        MediaController.PhotoEntry photoEntry = albumEntry.photos.get(num.intValue());
                        if (this.e) {
                            i11 = arrayList.indexOf(Integer.valueOf(photoEntry.imageId));
                        }
                        x5Var.setNum(i11);
                    } else {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) this.f43250f.get(num.intValue());
                        if (this.e) {
                            i11 = arrayList.indexOf(searchImage.f19543id);
                        }
                        x5Var.setNum(i11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o7Var.b(z10, false);
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i10) {
        boolean z10;
        float f7;
        boolean z11 = true;
        if (this.f43244b.size() == 0) {
            this.f43245b0.setPivotX(0.0f);
            this.f43245b0.setPivotY(0.0f);
            if (i10 == 0) {
                z11 = false;
            }
            h0(false, z11);
            return;
        }
        this.f43245b0.invalidate();
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!h0(true, z10) && i10 != 0) {
            this.f43245b0.setPivotX(AndroidUtilities.dp(21.0f));
            this.f43245b0.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            z10 z10Var = this.f43245b0;
            Property property = View.SCALE_X;
            float f10 = 0.9f;
            if (i10 == 1) {
                f7 = 1.1f;
            } else {
                f7 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z10Var, property, f7, 1.0f);
            z10 z10Var2 = this.f43245b0;
            Property property2 = View.SCALE_Y;
            if (i10 == 1) {
                f10 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(z10Var2, property2, f10, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f43245b0.setPivotX(0.0f);
        this.f43245b0.setPivotY(0.0f);
    }

    public final void k0() {
        String str;
        pq0 pq0Var = this.L;
        if (pq0Var != null) {
            pq0Var.l();
        }
        if (!this.f43263r && (this.f43258n.size() <= 0 || ((str = this.v) != null && !TextUtils.isEmpty(str)))) {
            this.N.e(false, true);
        } else {
            this.N.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.f43248d0;
        if (ruVar != null && ruVar.e) {
            if (z10) {
                ruVar.k(true);
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
        if (this.f43272x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f43272x, true);
            this.f43272x = 0;
        }
        org.telegram.ui.Components.ru ruVar = this.f43248d0;
        if (ruVar != null) {
            ruVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        org.telegram.ui.Components.mm0 mm0Var = this.K;
        if (mm0Var == null) {
            return;
        }
        if (this.f43248d0.e) {
            this.fragmentView.setTranslationY(f7);
            this.K.setTranslationY(0.0f);
            return;
        }
        mm0Var.setTranslationY(f7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        pq0 pq0Var = this.L;
        if (pq0Var != null) {
            pq0Var.l();
        }
        org.telegram.ui.Components.ru ruVar = this.f43248d0;
        if (ruVar != null) {
            ruVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.P;
        if (w0Var != null) {
            w0Var.F(true);
            if (!TextUtils.isEmpty(this.f43261p0)) {
                this.P.P(this.f43261p0, false);
                this.f43261p0 = null;
                c0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (z10 && (w0Var = this.P) != null) {
            AndroidUtilities.showKeyboard(w0Var.getSearchField());
        }
    }
}
