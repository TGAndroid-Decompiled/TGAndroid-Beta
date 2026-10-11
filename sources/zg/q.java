package zg;

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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.s5;
import org.telegram.ui.i61;
import org.telegram.ui.s21;
import org.telegram.ui.xd;
import rg.t0;
import w7.x5;
import yh.e5;
public final class q extends m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public boolean f54734a;
    public p f54735b;
    public t0 f54736c;
    public f d;
    public w8 f54737e;
    public LinearLayout f54738f;
    public xd h;
    public o f54739n;
    public z7 f54740r;
    public w8 f54741s;
    public q0 v;
    public FrameLayout f54742w;
    public ImageView f54743x;
    public gp0 f54744y;

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

    public final void W(b6 b6Var) {
        Editable text = this.f54739n.getText();
        Layout layout = this.f54739n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(b6Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            b6[] b6VarArr = (b6[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), b6.class);
            for (b6 b6Var2 : b6VarArr) {
                b6Var2.setAnimateChanges();
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
        if (this.I == this.f54734a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f20368a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f20368a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new z1(this) {
                public final q f54612b;

                {
                    this.f54612b = this;
                }

                @Override
                public final void f(a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f54612b.v.performClick();
                            return;
                        default:
                            this.f54612b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new z1(this) {
                public final q f54612b;

                {
                    this.f54612b = this;
                }

                @Override
                public final void f(a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f54612b.v.performClick();
                            return;
                        default:
                            this.f54612b.finishFragment();
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
                ad.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
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
                this.f54738f.setFocusableInTouchMode(true);
                this.f54738f.requestFocus();
            } else {
                this.f54739n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f54744y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f54744y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f54736c.animate().setListener(null).cancel();
            this.f54736c.animate().translationY(this.f54736c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(is.f27451f).setUpdateListener(new j(this, 1)).setListener(new l(this, 0)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.f54739n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f54739n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f54739n.getText());
        if (!this.f54739n.hasSelection()) {
            return false;
        }
        b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, b6.class);
        for (b6 b6Var : b6VarArr) {
            this.E.remove(Long.valueOf(b6Var.documentId));
            this.F.remove(Long.valueOf(b6Var.documentId));
            this.f54735b.A(Long.valueOf(b6Var.documentId));
        }
        this.f54739n.dispatchKeyEvent(new KeyEvent(0, 67));
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
                        if (l4.longValue() == tL_availableReaction.activate_animation.f20038id) {
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
        if (this.S != i10 || this.f54734a != z10) {
            this.f54734a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f54737e.setChecked(z12);
            if (z12) {
                i11 = h6.f20823f6;
            } else {
                i11 = h6.f20806e6;
            }
            int x02 = h6.x0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.f54737e.b(x02, true);
                } else {
                    this.f54737e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                this.f54737e.setBackgroundColor(x02);
            }
            this.S = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Z();
                    this.f54742w.animate().setListener(null).cancel();
                    this.f54738f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f54742w.animate().alpha(0.0f).setDuration(350L);
                    is isVar = is.f27451f;
                    duration.setInterpolator(isVar).setListener(new l(this, 2)).start();
                    this.f54738f.animate().alpha(0.0f).setDuration(350L).setInterpolator(isVar).setListener(new l(this, 3)).start();
                    return;
                }
                this.f54738f.setVisibility(4);
                this.f54742w.setVisibility(4);
                return;
            }
            this.f54738f.setVisibility(0);
            this.f54742w.setVisibility(0);
            if (z11) {
                this.f54742w.animate().setListener(null).cancel();
                this.f54738f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f54738f.animate().alpha(1.0f).setDuration(350L);
                is isVar2 = is.f27451f;
                duration2.setInterpolator(isVar2).setListener(new l(this, 1)).start();
                this.f54742w.animate().alpha(1.0f).setDuration(350L).setInterpolator(isVar2).start();
                LinkedHashMap linkedHashMap = this.E;
                if (linkedHashMap.isEmpty()) {
                    this.f54735b.K.clear();
                    this.f54739n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.H;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        p0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.F, spannableStringBuilder, this.f54735b, this.f54739n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.J) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f54739n.append(spannableStringBuilder);
                    this.f54739n.m();
                    i61 i61Var = this.f54735b.f38909p0;
                    if (i61Var != null) {
                        i61Var.l();
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
        w8 w8Var = this.f54741s;
        boolean z10 = w8Var.f23680e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            b6 b6Var = (b6) linkedHashMap.remove(-1L);
            if (b6Var != null) {
                b6Var.setRemoved(new e5(4, this, b6Var));
            }
            W(b6Var);
            this.f54735b.x(-1L, true);
            Y(false);
            this.f54739n.setMaxLength(i10);
            c0(this.S, this.f54734a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.f54739n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                m mVar = new m(this);
                mVar.cacheType = s5.g();
                mVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, mVar);
                spannableString.setSpan(mVar, 0, spannableString.length(), 33);
                this.f54739n.getText().insert(0, spannableString);
                this.f54735b.x(-1L, true);
                Y(true);
                W(mVar);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            c0(this.S, true, true);
        }
        this.f54739n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
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
            getMessagesController().getBoostsController().getBoostsStats(-j3, new i(this, 0));
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
        this.f54739n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.f54739n.setFocusable(true);
            this.f54739n.setFocusableInTouchMode(true);
            if (this.K) {
                this.f54739n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.f54739n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f54735b == null) {
                p pVar = new p(this, this, getParentActivity(), getResourceProvider(), h6.w0(h6.G6, getResourceProvider()));
                this.f54735b = pVar;
                pVar.setAnimationsEnabled(false);
                this.f54735b.setClipChildren(false);
                this.f54735b.setBackgroundColor(h6.x0(null, h6.f20786d6, false));
                this.f54736c.addView(this.f54735b, x5.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f54736c.addView(this.d, x5.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -1, 85));
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f54735b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new s21(24), 200L);
        }
    }
}
