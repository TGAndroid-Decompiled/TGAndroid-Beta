package zf;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import h7.z5;
import java.io.File;
import java.util.ArrayList;
import lh.n6;
import lh.p6;
import lh.r5;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;

public abstract class e1 extends j {
    public d5 A0;
    public d5 B0;
    public d5 C0;
    public d5 D0;
    public d5 E0;
    public d5 F0;
    public d5 G0;
    public d5 H0;
    public final ag.w m0;

    public final x0 f50388n0;

    public final ArrayList f50389o0;

    public final MessageObject.GroupedMessages f50390p0;

    public boolean f50391q0;

    public boolean f50392r0;

    public TextureView f50393s0;

    public boolean f50394t0;

    public int f50395u0;

    public int f50396v0;

    public boolean f50397w0;

    public boolean f50398x0;

    public final SparseIntArray f50399y0;

    public final com.google.firebase.messaging.m f50400z0;

    public e1(Context context, PointF pointF, ArrayList arrayList, z9 z9Var, boolean z10, p6 p6Var) {
        w0 w0Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean boolD;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        super(context, pointF);
        this.f50389o0 = new ArrayList();
        this.f50395u0 = 1;
        this.f50396v0 = 1;
        this.f50397w0 = true;
        this.f50398x0 = g6.I.q();
        this.f50399y0 = new SparseIntArray();
        r5 r5Var = (r5) this;
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.f4606f = r5Var;
        TextPaint textPaint = new TextPaint();
        mVar.f4602a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        mVar.f4603b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        mVar.f4604c = textPaint3;
        new Paint(3);
        mVar.d = new Paint(3);
        Paint paint = new Paint(3);
        mVar.f4605e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.f50400z0 = mVar;
        setRotation(0.0f);
        setScale(1.0f);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            TLRPC.Message message2 = messageObject.messageOwner;
            int i11 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else {
                if (message2 instanceof TLRPC.TL_messageService) {
                    tL_messageService = new TLRPC.TL_messageService();
                } else {
                    message = message2;
                }
                boolD = z7.D(messageObject);
                if (boolD == null && boolD.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i12 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i12, message, messageObject.replyMessageObject, MessagesController.getInstance(i12).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
                messageObject2.setType();
                this.f50389o0.add(messageObject2);
            }
            tL_messageService.f22401id = message2.f22401id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.mentioned = message2.mentioned;
            tL_messageService.media_unread = message2.media_unread;
            tL_messageService.out = message2.out;
            tL_messageService.unread = message2.unread;
            tL_messageService.entities = message2.entities;
            tL_messageService.via_bot_name = message2.via_bot_name;
            tL_messageService.reply_markup = message2.reply_markup;
            tL_messageService.views = message2.views;
            tL_messageService.forwards = message2.forwards;
            tL_messageService.replies = message2.replies;
            tL_messageService.edit_date = message2.edit_date;
            tL_messageService.silent = message2.silent;
            tL_messageService.post = message2.post;
            tL_messageService.from_scheduled = message2.from_scheduled;
            tL_messageService.legacy = message2.legacy;
            tL_messageService.edit_hide = message2.edit_hide;
            tL_messageService.pinned = message2.pinned;
            tL_messageService.fwd_from = message2.fwd_from;
            tL_messageService.via_bot_id = message2.via_bot_id;
            tL_messageService.reply_to = message2.reply_to;
            tL_messageService.post_author = message2.post_author;
            tL_messageService.grouped_id = message2.grouped_id;
            tL_messageService.reactions = message2.reactions;
            tL_messageService.restriction_reason = message2.restriction_reason;
            tL_messageService.ttl_period = message2.ttl_period;
            tL_messageService.noforwards = message2.noforwards;
            tL_messageService.invert_media = message2.invert_media;
            tL_messageService.send_state = message2.send_state;
            tL_messageService.fwd_msg_id = message2.fwd_msg_id;
            tL_messageService.attachPath = message2.attachPath;
            tL_messageService.params = message2.params;
            tL_messageService.random_id = message2.random_id;
            tL_messageService.local_id = message2.local_id;
            tL_messageService.dialog_id = message2.dialog_id;
            tL_messageService.ttl = message2.ttl;
            tL_messageService.destroyTime = message2.destroyTime;
            tL_messageService.destroyTimeMillis = message2.destroyTimeMillis;
            tL_messageService.layer = message2.layer;
            tL_messageService.seq_in = message2.seq_in;
            tL_messageService.seq_out = message2.seq_out;
            tL_messageService.with_my_score = message2.with_my_score;
            tL_messageService.replyMessage = message2.replyMessage;
            tL_messageService.reqId = message2.reqId;
            tL_messageService.realId = message2.realId;
            tL_messageService.stickerVerified = message2.stickerVerified;
            tL_messageService.isThreadMessage = message2.isThreadMessage;
            tL_messageService.voiceTranscription = message2.voiceTranscription;
            tL_messageService.voiceTranscriptionOpen = message2.voiceTranscriptionOpen;
            tL_messageService.voiceTranscriptionRated = message2.voiceTranscriptionRated;
            tL_messageService.voiceTranscriptionFinal = message2.voiceTranscriptionFinal;
            tL_messageService.voiceTranscriptionForce = message2.voiceTranscriptionForce;
            tL_messageService.voiceTranscriptionId = message2.voiceTranscriptionId;
            tL_messageService.premiumEffectWasPlayed = message2.premiumEffectWasPlayed;
            tL_messageService.originalLanguage = message2.originalLanguage;
            tL_messageService.translatedToLanguage = message2.translatedToLanguage;
            tL_messageService.translatedText = message2.translatedText;
            tL_messageService.replyStory = message2.replyStory;
            message = tL_messageService;
            boolD = z7.D(messageObject);
            if (boolD == null) {
            }
            message.voiceTranscriptionOpen = false;
            int i13 = messageObject.currentAccount;
            MessageObject messageObject3 = new MessageObject(i13, message, messageObject.replyMessageObject, MessagesController.getInstance(i13).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
            messageObject3.setType();
            this.f50389o0.add(messageObject3);
        }
        this.f50390p0 = null;
        if (this.f50389o0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f50390p0 = groupedMessages;
            groupedMessages.messages.addAll(this.f50389o0);
            groupedMessages.groupId = ((MessageObject) this.f50389o0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        ag.w wVar = new ag.w(r5Var, context);
        this.m0 = wVar;
        addView(wVar, z5.c(-1.0f, -1));
        x0 x0Var = new x0(r5Var, context, this.f50400z0);
        this.f50388n0 = x0Var;
        x0Var.setAdapter(new a1(r5Var, context, z9Var, p6Var, z10));
        b1 b1Var = new b1(r5Var);
        b1Var.O = new c1(r5Var);
        x0Var.setLayoutManager(b1Var);
        x0Var.i(new d1());
        wVar.addView(x0Var, z5.c(-1.0f, -1));
        if (p6Var != null && p6Var.f16531g) {
            n6 n6Var = new n6(r5Var, 24);
            w0 w0Var2 = new w0(0, r5Var);
            p6Var.f16527b = n6Var;
            p6Var.f16528c = w0Var2;
            TextureView textureView = p6Var.f16526a;
            if (textureView != null) {
                n6Var.run(textureView);
            }
            if (p6Var.d && (w0Var = p6Var.f16528c) != null) {
                w0Var.run(Integer.valueOf(p6Var.f16529e), Integer.valueOf(p6Var.f16530f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.s1 getCell() {
        x0 x0Var = this.f50388n0;
        if (x0Var == null) {
            return null;
        }
        for (int i10 = 0; i10 < x0Var.getChildCount(); i10++) {
            if (x0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                return (org.telegram.ui.Cells.s1) x0Var.getChildAt(i10);
            }
        }
        return null;
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        return new yj0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        setX(getPositionX() - measuredWidth);
        setY(getPositionY() - measuredHeight);
        m();
        if (this.f50392r0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        ag.w wVar = this.m0;
        wVar.measure(i10, i11);
        setMeasuredDimension(wVar.getMeasuredWidth(), wVar.getMeasuredHeight());
        k();
        if (this.f50397w0) {
            ArrayList arrayList = this.f50389o0;
            if (arrayList != null) {
                z10 = arrayList.size() == 1 && ((MessageObject) arrayList.get(0)).contentType == 1;
            }
            float fMin = Math.min((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(z10 ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(z10 ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (fMin < 1.0f) {
                setScale(fMin);
            }
            PointF position = getPosition();
            if (!z10) {
                position.x -= Math.min(1.0f, fMin) * AndroidUtilities.dp(19.0f);
            }
            setPosition(position);
            this.f50397w0 = false;
        }
    }

    public final float r(RectF rectF) {
        float y10;
        float imageX;
        float imageX2;
        float imageY;
        float fMin = 2.1474836E9f;
        float fMin2 = 2.1474836E9f;
        float fMax = -2.1474836E9f;
        float fMax2 = -2.1474836E9f;
        int i10 = 0;
        while (true) {
            x0 x0Var = this.f50388n0;
            if (i10 >= x0Var.getChildCount()) {
                rectF.set(fMin, fMin2, fMax, fMax2);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
            View childAt = x0Var.getChildAt(i10);
            boolean z10 = childAt instanceof org.telegram.ui.Cells.s1;
            ag.w wVar = this.m0;
            if (z10) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == null || !s1Var.getMessageObject().isRoundVideo() || s1Var.getPhotoImage() == null) {
                    float x8 = childAt.getX() + wVar.getX() + s1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                    if (this.f50390p0 == null) {
                        x8 += AndroidUtilities.dp(8.0f);
                    }
                    float x10 = ((childAt.getX() + wVar.getX()) + s1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                    float fDp = AndroidUtilities.dp(2.0f) + childAt.getY() + wVar.getY() + s1Var.getBackgroundDrawableTop();
                    y10 = ((childAt.getY() + wVar.getY()) + s1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                    imageX = x8;
                    imageX2 = x10;
                    imageY = fDp;
                } else {
                    imageX = s1Var.getPhotoImage().getImageX() + s1Var.getX() + wVar.getX();
                    imageX2 = s1Var.getPhotoImage().getImageX2() + s1Var.getX() + wVar.getX();
                    imageY = s1Var.getPhotoImage().getImageY() + s1Var.getY() + wVar.getY();
                    y10 = s1Var.getPhotoImage().getImageY2() + s1Var.getY() + wVar.getY();
                }
                fMin = Math.min(Math.min(fMin, imageX), imageX2);
                fMax = Math.max(Math.max(fMax, imageX), imageX2);
                fMin2 = Math.min(Math.min(fMin2, imageY), y10);
                fMax2 = Math.max(Math.max(fMax2, imageY), y10);
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                if (v0Var.B0.d()) {
                    float x11 = v0Var.getX() + wVar.getX() + v0Var.getBoundsLeft();
                    float x12 = v0Var.getX() + wVar.getX() + v0Var.getBoundsRight();
                    float y11 = v0Var.getY() + wVar.getY();
                    float y12 = v0Var.getY() + wVar.getY() + v0Var.getMeasuredHeight();
                    fMin = Math.min(Math.min(fMin, x11), x12);
                    fMax = Math.max(Math.max(fMax, x11), x12);
                    fMin2 = Math.min(Math.min(fMin2, y11), y12);
                    fMax2 = Math.max(Math.max(fMax2, y11), y12);
                }
            }
            i10++;
        }
    }

    public final void s() {
        x0 x0Var = this.f50388n0;
        x0Var.invalidate();
        for (int i10 = 0; i10 < x0Var.getChildCount(); i10++) {
            x0Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(z7 z7Var) {
        boolean z10;
        f6 f6VarN0;
        String[] strArr;
        String str;
        SparseIntArray sparseIntArrayQ0;
        int[] iArr;
        int i10;
        e6 e6VarK;
        int i11;
        if (z7Var == null) {
            this.f50399y0.clear();
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (g6.N0(string) == null || g6.N0(string).q()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (g6.N0(string2) == null || !g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        f6 f6Var = g6.I;
        if (string.equals(string2)) {
            if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            z10 = z7Var.f17243y0;
            this.f50398x0 = z10;
            if (z10) {
                f6VarN0 = g6.N0(str3);
            } else {
                f6VarN0 = g6.N0(str2);
            }
            strArr = new String[1];
            str = f6VarN0.d;
            if (str != null) {
                sparseIntArrayQ0 = g6.Q0(null, str, strArr);
            } else {
                sparseIntArrayQ0 = g6.Q0(new File(f6VarN0.f22943b), null, strArr);
            }
            this.f50399y0.clear();
            iArr = g6.nl;
            if (iArr != null) {
                for (i11 = 0; i11 < iArr.length; i11++) {
                    this.f50399y0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < sparseIntArrayQ0.size(); i10++) {
                this.f50399y0.put(sparseIntArrayQ0.keyAt(i10), sparseIntArrayQ0.valueAt(i10));
            }
            e6VarK = f6VarN0.k(false);
            if (e6VarK != null) {
                e6VarK.c(sparseIntArrayQ0, this.f50399y0);
            }
            s();
        }
        str3 = string2;
        str2 = string;
        z10 = z7Var.f17243y0;
        this.f50398x0 = z10;
        if (z10) {
            f6VarN0 = g6.N0(str3);
        } else {
            f6VarN0 = g6.N0(str2);
        }
        strArr = new String[1];
        str = f6VarN0.d;
        if (str != null) {
            sparseIntArrayQ0 = g6.Q0(null, str, strArr);
        } else {
            sparseIntArrayQ0 = g6.Q0(new File(f6VarN0.f22943b), null, strArr);
        }
        this.f50399y0.clear();
        iArr = g6.nl;
        if (iArr != null) {
            while (i11 < iArr.length) {
                this.f50399y0.put(i11, iArr[i11]);
            }
        }
        while (i10 < sparseIntArrayQ0.size()) {
            this.f50399y0.put(sparseIntArrayQ0.keyAt(i10), sparseIntArrayQ0.valueAt(i10));
        }
        e6VarK = f6VarN0.k(false);
        if (e6VarK != null) {
            e6VarK.c(sparseIntArrayQ0, this.f50399y0);
        }
        s();
    }
}
