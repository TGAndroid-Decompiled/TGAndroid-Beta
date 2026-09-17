package zg;

import ai.f3;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x5;
import org.telegram.ui.h61;
import org.telegram.ui.p91;
import org.telegram.ui.zd;
import xh.g1;
public final class q extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap E;
    public final ArrayList F;
    public final LinkedHashMap G;
    public final ArrayList H;
    public boolean I;
    public final int J;
    public boolean K;
    public final TLRPC.ChatFull L;
    public final long M;
    public int N;
    public int O;
    public TLRPC.Chat P;
    public TL_stories.TL_premium_boostsStatus Q;
    public int R;
    public int S;
    public boolean T;
    public final h U;
    public boolean f49152a;
    public p f49153b;
    public g1 f49154c;
    public f d;
    public w8 e;
    public LinearLayout f49155f;
    public zd h;
    public o f49156n;
    public z7 f49157r;
    public w8 f49158s;
    public s0 v;
    public FrameLayout f49159w;
    public ImageView f49160x;
    public ao0 f49161y;

    public q(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new LinkedHashMap();
        this.F = new ArrayList();
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.J = getMessagesController().boostsChannelLevelMax;
        this.K = false;
        this.S = -1;
        this.U = new h(this, 5);
        this.M = j3;
        this.L = chatFull;
    }

    public static boolean U(q qVar) {
        return qVar.inPreviewMode;
    }

    public static boolean V(q qVar) {
        return qVar.inBubbleMode;
    }

    public final void W(x5 x5Var) {
        Editable text = this.f49156n.getText();
        Layout layout = this.f49156n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(x5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            x5[] x5VarArr = (x5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), x5.class);
            for (x5 x5Var2 : x5VarArr) {
                x5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.E.keySet().equals(this.G.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Q;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.R) {
            z12 = false;
        }
        if (this.I == this.f49152a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f18446a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f18446a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) {
                public final q f49051b;

                {
                    this.f49051b = this;
                }

                @Override
                public final void f(c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49051b.v.performClick();
                            return;
                        default:
                            this.f49051b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) {
                public final q f49051b;

                {
                    this.f49051b = this;
                }

                @Override
                public final void f(c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49051b.v.performClick();
                            return;
                        default:
                            this.f49051b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void Y(boolean z10) {
        if (this.Q == null) {
            return;
        }
        if (this.S == 0) {
            this.S = 1;
        }
        int size = b0(true).size();
        this.R = size;
        if (this.Q.level < size) {
            if (z10) {
                vc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.R);
            return;
        }
        this.v.f(null, true);
    }

    public final void Z() {
        if (this.K) {
            this.K = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f49155f.setFocusableInTouchMode(true);
                this.f49155f.requestFocus();
            } else {
                this.f49156n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f49161y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f49161y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f49154c.animate().setListener(null).cancel();
            this.f49154c.animate().translationY(this.f49154c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(qr.f27380f).setUpdateListener(new i(this, 1)).setListener(new l(this, 0)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.f49156n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f49156n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49156n.getText());
        if (!this.f49156n.hasSelection()) {
            return false;
        }
        x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, x5.class);
        for (x5 x5Var : x5VarArr) {
            this.E.remove(Long.valueOf(x5Var.documentId));
            this.F.remove(Long.valueOf(x5Var.documentId));
            this.f49153b.A(Long.valueOf(x5Var.documentId));
        }
        this.f49156n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.F;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.H;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l4.longValue() == tL_availableReaction.activate_animation.f18127id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l4.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                }
            }
        }
        if (z10) {
            return arrayList2;
        }
        return arrayList;
    }

    public final void c0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        if (this.S != i10 || this.f49152a != z10) {
            this.f49152a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.e.setChecked(z12);
            if (z12) {
                i11 = j6.f18898f6;
            } else {
                i11 = j6.f18881e6;
            }
            int w02 = j6.w0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.e.b(w02, true);
                } else {
                    this.e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.e.setBackgroundColor(w02);
            }
            this.S = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Z();
                    this.f49159w.animate().setListener(null).cancel();
                    this.f49155f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f49159w.animate().alpha(0.0f).setDuration(350L);
                    qr qrVar = qr.f27380f;
                    duration.setInterpolator(qrVar).setListener(new l(this, 2)).start();
                    this.f49155f.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).setListener(new l(this, 3)).start();
                    return;
                }
                this.f49155f.setVisibility(4);
                this.f49159w.setVisibility(4);
                return;
            }
            this.f49155f.setVisibility(0);
            this.f49159w.setVisibility(0);
            if (z11) {
                this.f49159w.animate().setListener(null).cancel();
                this.f49155f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f49155f.animate().alpha(1.0f).setDuration(350L);
                qr qrVar2 = qr.f27380f;
                duration2.setInterpolator(qrVar2).setListener(new l(this, 1)).start();
                this.f49159w.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar2).start();
                LinkedHashMap linkedHashMap = this.E;
                if (linkedHashMap.isEmpty()) {
                    this.f49153b.K.clear();
                    this.f49156n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.H;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        r0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.F, spannableStringBuilder, this.f49153b, this.f49156n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.J) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f49156n.append(spannableStringBuilder);
                    this.f49156n.m();
                    h61 h61Var = this.f49153b.f34476p0;
                    if (h61Var != null) {
                        h61Var.l();
                    }
                    Y(false);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: zg.q.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        w8 w8Var = this.f49158s;
        boolean z10 = w8Var.e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            x5 x5Var = (x5) linkedHashMap.remove(-1L);
            if (x5Var != null) {
                x5Var.setRemoved(new uh.i(27, this, x5Var));
            }
            W(x5Var);
            this.f49153b.x(-1L, true);
            Y(false);
            this.f49156n.setMaxLength(i10);
            c0(this.S, this.f49152a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.f49156n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                m mVar = new m(this);
                mVar.cacheType = o5.g();
                mVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, mVar);
                spannableString.setSpan(mVar, 0, spannableString.length(), 33);
                this.f49156n.getText().insert(0, spannableString);
                this.f49153b.x(-1L, true);
                Y(true);
                W(mVar);
            } catch (Exception e) {
                FileLog.e(e);
            }
            c0(this.S, true, true);
        }
        this.f49156n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            e5 e5Var = this.parentLayout;
            if (e5Var != null && e5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.K) {
            if (z10) {
                Z();
                return false;
            }
        } else if (!X(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.M;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.P = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.P = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.P, true);
            }
            return false;
        }
        if (this.L != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new f3(this, 11));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.H.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.T = true;
        this.f49156n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.f49156n.setFocusable(true);
            this.f49156n.setFocusableInTouchMode(true);
            if (this.K) {
                this.f49156n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.f49156n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f49153b == null) {
                p pVar = new p(this, this, getParentActivity(), getResourceProvider(), j6.v0(j6.G6, getResourceProvider()));
                this.f49153b = pVar;
                pVar.setAnimationsEnabled(false);
                this.f49153b.setClipChildren(false);
                this.f49153b.setBackgroundColor(j6.w0(null, j6.f18862d6, false));
                this.f49154c.addView(this.f49153b, w7.x5.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new j(this, 0));
                this.f49154c.addView(this.d, w7.x5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f49153b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new p91(20), 200L);
        }
    }
}
