package yg;

import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class f {
    public final SparseArray f50223a = new SparseArray();

    public static int a(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, TLRPC.InputMedia inputMedia) {
        if (tL_inputMediaPoll.attached_media == inputMedia) {
            return -2;
        }
        if (tL_inputMediaPoll.solution_media == inputMedia) {
            return -3;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (tL_inputMediaPoll.poll.answers.get(i9).input_media == inputMedia) {
                return i9;
            }
        }
        return -1;
    }

    public static String c(TLRPC.Message message, int i9) {
        SparseArray<String> sparseArray;
        if (message != null && (sparseArray = message.pollMediaAttachPaths) != null) {
            return sparseArray.get(i9);
        }
        return null;
    }

    public static TLRPC.InputMedia d(TLRPC.TL_inputMediaPoll tL_inputMediaPoll) {
        TLRPC.InputMedia inputMedia = tL_inputMediaPoll.attached_media;
        if (inputMedia != null) {
            return inputMedia;
        }
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPoll.solution_media;
        if (inputMedia2 != null) {
            return inputMedia2;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.poll.answers.get(i9).input_media;
            if (inputMedia3 != null) {
                return inputMedia3;
            }
        }
        return null;
    }

    public static TLRPC.InputMedia e(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i9) {
        TLRPC.PollAnswer pollAnswer;
        if (i9 == -2) {
            return tL_inputMediaPoll.attached_media;
        }
        if (i9 == -3) {
            return tL_inputMediaPoll.solution_media;
        }
        if (i9 < 0 || i9 >= tL_inputMediaPoll.poll.answers.size() || (pollAnswer = tL_inputMediaPoll.poll.answers.get(i9)) == null) {
            return null;
        }
        return pollAnswer.input_media;
    }

    public static TLRPC.MessageMedia f(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i9) {
        TLRPC.PollAnswer pollAnswer;
        if (i9 == -2) {
            return tL_messageMediaPoll.attached_media;
        }
        if (i9 == -3) {
            return tL_messageMediaPoll.results.solution_media;
        }
        if (i9 < 0 || i9 >= tL_messageMediaPoll.poll.answers.size() || (pollAnswer = tL_messageMediaPoll.poll.answers.get(i9)) == null) {
            return null;
        }
        return pollAnswer.media;
    }

    public static byte[] g(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("option");
            if (queryParameter != null) {
                return Base64.decode(queryParameter, 9);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i9) {
        TLRPC.PollAnswer pollAnswer;
        if (i9 == -2) {
            tL_inputMediaPoll.attached_media = null;
        } else if (i9 == -3) {
            tL_inputMediaPoll.solution_media = null;
        } else if (i9 >= 0 && i9 < tL_inputMediaPoll.poll.answers.size() && (pollAnswer = tL_inputMediaPoll.poll.answers.get(i9)) != null) {
            pollAnswer.input_media = null;
        }
    }

    public static void j(TLRPC.Message message, String str, int i9) {
        if (message == null) {
            return;
        }
        if (message.pollMediaAttachPaths == null) {
            message.pollMediaAttachPaths = new SparseArray<>();
        }
        message.pollMediaAttachPaths.put(i9, str);
    }

    public static void k(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i9, TLRPC.InputMedia inputMedia) {
        if (i9 == -2) {
            tL_inputMediaPoll.attached_media = inputMedia;
        } else if (i9 == -3) {
            tL_inputMediaPoll.solution_media = inputMedia;
        } else if (i9 >= 0 && i9 < tL_inputMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_inputMediaPoll.poll.answers.get(i9);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                pollAnswer.input_media = inputMedia;
                return;
            }
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.input_media = inputMedia;
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
            tL_inputMediaPoll.poll.answers.set(i9, tL_inputPollAnswer);
        }
    }

    public static void l(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i9, TLRPC.MessageMedia messageMedia) {
        if (i9 == -2) {
            tL_messageMediaPoll.attached_media = messageMedia;
        } else if (i9 == -3) {
            tL_messageMediaPoll.results.solution_media = messageMedia;
        } else if (i9 >= 0 && i9 < tL_messageMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i9);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                tL_pollAnswer.text = pollAnswer.text;
                tL_pollAnswer.option = r0;
                byte[] bArr = {(byte) (i9 + 48)};
                tL_pollAnswer.media = messageMedia;
                tL_messageMediaPoll.poll.answers.set(i9, tL_pollAnswer);
                return;
            }
            pollAnswer.media = messageMedia;
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
        }
    }

    public final e b(int i9) {
        return (e) this.f50223a.get(i9);
    }

    public final void h(int i9) {
        SparseArray sparseArray = this.f50223a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (sparseArray.keyAt(i10) > i9) {
                if (i9 >= 0) {
                    SparseArray clone = sparseArray.clone();
                    sparseArray.clear();
                    int size2 = clone.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        int keyAt = clone.keyAt(i11);
                        e eVar = (e) clone.valueAt(i11);
                        if (keyAt < i9) {
                            sparseArray.put(keyAt, eVar);
                        }
                        if (keyAt > i9) {
                            sparseArray.put(keyAt - 1, eVar);
                        }
                    }
                    return;
                }
                return;
            }
        }
        sparseArray.remove(i9);
    }
}
