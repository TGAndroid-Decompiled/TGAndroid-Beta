package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tn {
    public MessageObject f42244a;
    public int f42245b;
    public int f42246c;
    public byte[] f42247e;
    public boolean f42248f;
    public boolean h;
    public String f42250i;
    public ArrayList f42251j;
    public TLRPC.TodoItem f42252k;
    public TLRPC.PollAnswer f42253l;
    public boolean f42249g = false;
    public int d = -1;

    public tn(int i10, int i11, MessageObject messageObject) {
        this.f42244a = messageObject;
        this.f42245b = i10;
        this.f42246c = i11;
        e();
    }

    public static tn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new tn(i10, i11, messageObject);
    }

    public static tn c(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && message.message != null) {
            return b(0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, messageObject.messageOwner.message.length()), messageObject);
        }
        return null;
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i10;
        int i11;
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && (str = message.message) != null) {
            int i12 = this.f42246c;
            if (i12 >= this.f42245b && i12 <= str.length() && this.f42245b <= messageObject.messageOwner.message.length() && (i10 = this.f42245b) >= 0 && (i11 = this.f42246c) >= 0) {
                if (TextUtils.equals(this.f42250i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f42244a = messageObject;
                    e();
                    this.f42248f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f42250i);
                if (indexOf >= 0) {
                    this.f42244a = messageObject;
                    this.f42246c = (this.f42246c - this.f42245b) + indexOf;
                    this.f42245b = indexOf;
                    e();
                    this.f42248f = false;
                    return;
                }
                this.f42244a = messageObject;
                this.f42245b = 0;
                this.f42246c = messageObject.messageOwner.message.length();
                e();
                this.f42248f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f42245b + ", " + this.f42246c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f42248f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f42248f = false;
    }

    public final boolean d() {
        if (this.f42249g) {
            if (this.f42252k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f42253l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f42250i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f42244a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f42249g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f42252k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.f42247e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f42253l = findPollItem;
                return true;
            } else {
                int i11 = this.f42246c;
                if (i11 >= this.f42245b && i11 <= str.length() && this.f42245b <= this.f42244a.messageOwner.message.length() && (i10 = this.f42245b) >= 0 && this.f42246c >= 0) {
                    String str2 = this.f42244a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f42246c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f42246c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f42250i = this.f42244a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f42251j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f42244a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f42244a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f42244a.messageOwner.entities.get(i12);
                            int i13 = messageEntity.offset;
                            if (AndroidUtilities.intersect1dInclusive(max, min, i13, messageEntity.length + i13)) {
                                if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityBold();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityItalic();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityUnderline();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityStrike();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntitySpoiler();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji3 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                    tL_messageEntityCustomEmoji2.document_id = tL_messageEntityCustomEmoji3.document_id;
                                    tL_messageEntityCustomEmoji2.document = tL_messageEntityCustomEmoji3.document;
                                    tL_messageEntityCustomEmoji = tL_messageEntityCustomEmoji2;
                                }
                                int i14 = messageEntity.offset;
                                int i15 = i14 - max;
                                int i16 = (i14 + messageEntity.length) - max;
                                if ((i15 >= 0 || i16 >= 0) && (i15 <= min || i16 <= min)) {
                                    tL_messageEntityCustomEmoji.offset = Math.max(0, i15);
                                    tL_messageEntityCustomEmoji.length = Math.min(i16, min - max) - tL_messageEntityCustomEmoji.offset;
                                    if (this.f42251j == null) {
                                        this.f42251j = new ArrayList();
                                    }
                                    this.f42251j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f42245b + ", " + this.f42246c + ", len=" + this.f42244a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
