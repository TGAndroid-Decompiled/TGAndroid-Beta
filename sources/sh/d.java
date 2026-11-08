package sh;

import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class d {
    public final SparseArray f55295a = new SparseArray();

    public static int a(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, TLRPC.InputMedia inputMedia) {
        if (tL_inputMediaPoll.attached_media == inputMedia) {
            return -2;
        }
        if (tL_inputMediaPoll.solution_media == inputMedia) {
            return -3;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (tL_inputMediaPoll.poll.answers.get(i7).input_media == inputMedia) {
                return i7;
            }
        }
        return -1;
    }

    public static String c(int i7, TLRPC.Message message) {
        SparseArray<String> sparseArray;
        if (message != null && (sparseArray = message.pollMediaAttachPaths) != null) {
            return sparseArray.get(i7);
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
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.poll.answers.get(i7).input_media;
            if (inputMedia3 != null) {
                return inputMedia3;
            }
        }
        return null;
    }

    public static TLRPC.InputMedia e(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i7) {
        TLRPC.PollAnswer pollAnswer;
        if (i7 == -2) {
            return tL_inputMediaPoll.attached_media;
        }
        if (i7 == -3) {
            return tL_inputMediaPoll.solution_media;
        }
        if (i7 < 0 || i7 >= tL_inputMediaPoll.poll.answers.size() || (pollAnswer = tL_inputMediaPoll.poll.answers.get(i7)) == null) {
            return null;
        }
        return pollAnswer.input_media;
    }

    public static TLRPC.MessageMedia f(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i7) {
        TLRPC.PollAnswer pollAnswer;
        if (i7 == -2) {
            return tL_messageMediaPoll.attached_media;
        }
        if (i7 == -3) {
            return tL_messageMediaPoll.results.solution_media;
        }
        if (i7 < 0 || i7 >= tL_messageMediaPoll.poll.answers.size() || (pollAnswer = tL_messageMediaPoll.poll.answers.get(i7)) == null) {
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

    public static void i(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i7) {
        TLRPC.PollAnswer pollAnswer;
        if (i7 == -2) {
            tL_inputMediaPoll.attached_media = null;
        } else if (i7 == -3) {
            tL_inputMediaPoll.solution_media = null;
        } else if (i7 >= 0 && i7 < tL_inputMediaPoll.poll.answers.size() && (pollAnswer = tL_inputMediaPoll.poll.answers.get(i7)) != null) {
            pollAnswer.input_media = null;
        }
    }

    public static void j(TLRPC.Message message, String str, int i7) {
        if (message == null) {
            return;
        }
        if (message.pollMediaAttachPaths == null) {
            message.pollMediaAttachPaths = new SparseArray<>();
        }
        message.pollMediaAttachPaths.put(i7, str);
    }

    public static void k(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i7, TLRPC.InputMedia inputMedia) {
        if (i7 == -2) {
            tL_inputMediaPoll.attached_media = inputMedia;
        } else if (i7 == -3) {
            tL_inputMediaPoll.solution_media = inputMedia;
        } else if (i7 >= 0 && i7 < tL_inputMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_inputMediaPoll.poll.answers.get(i7);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                pollAnswer.input_media = inputMedia;
                return;
            }
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.input_media = inputMedia;
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
            tL_inputMediaPoll.poll.answers.set(i7, tL_inputPollAnswer);
        }
    }

    public static void l(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i7, TLRPC.MessageMedia messageMedia) {
        if (i7 == -2) {
            tL_messageMediaPoll.attached_media = messageMedia;
        } else if (i7 == -3) {
            tL_messageMediaPoll.results.solution_media = messageMedia;
        } else if (i7 >= 0 && i7 < tL_messageMediaPoll.poll.answers.size()) {
            TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i7);
            if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                tL_pollAnswer.text = pollAnswer.text;
                tL_pollAnswer.option = r0;
                byte[] bArr = {(byte) (i7 + 48)};
                tL_pollAnswer.media = messageMedia;
                tL_messageMediaPoll.poll.answers.set(i7, tL_pollAnswer);
                return;
            }
            pollAnswer.media = messageMedia;
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.text = pollAnswer.text;
            tL_inputPollAnswer.media = pollAnswer.media;
            tL_inputPollAnswer.option = pollAnswer.option;
        }
    }

    public final c b(int i7) {
        return (c) this.f55295a.get(i7);
    }

    public final void h(int i7) {
        SparseArray sparseArray = this.f55295a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (sparseArray.keyAt(i10) > i7) {
                if (i7 >= 0) {
                    SparseArray clone = sparseArray.clone();
                    sparseArray.clear();
                    int size2 = clone.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        int keyAt = clone.keyAt(i11);
                        c cVar = (c) clone.valueAt(i11);
                        if (keyAt < i7) {
                            sparseArray.put(keyAt, cVar);
                        }
                        if (keyAt > i7) {
                            sparseArray.put(keyAt - 1, cVar);
                        }
                    }
                    return;
                }
                return;
            }
        }
        sparseArray.remove(i7);
    }
}
