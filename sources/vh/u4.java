package vh;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String B;
    public String C;
    public TLRPC.InputFile D;
    public boolean E;
    public final int f46204a;
    public final String f46205b;
    public final boolean f46206c;
    public final boolean d;
    public final boolean e;
    public final int f46207f;
    public final int h;
    public final int f46208n;
    public final TLRPC.Document f46209r;
    public final t4 f46210s;
    public boolean v;
    public boolean f46211w;
    public boolean f46212x;
    public int f46213y;

    public u4(int i10, String str, boolean z4, int i11, int i12, int i13, e3 e3Var) {
        this.f46204a = i10;
        this.f46205b = str;
        this.f46206c = z4;
        this.d = false;
        this.e = false;
        this.f46207f = i11;
        this.h = i12;
        this.f46208n = i13;
        this.f46209r = null;
        this.f46210s = e3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z4;
        if (!this.f46211w && !this.f46212x) {
            this.B = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46204a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f46206c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f46204a);
            String str2 = this.B;
            if (!this.f46206c && !this.d && !this.e) {
                z4 = true;
            } else {
                z4 = false;
            }
            fileLoader.uploadFile(str2, false, z4, i10);
        }
    }

    public final void b() {
        if (!this.f46212x && !this.f46211w) {
            this.f46211w = true;
            try {
                if (this.B != null) {
                    FileLoader.getInstance(this.f46204a).cancelFileUpload(this.B, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f46213y != 0) {
                ConnectionsManager.getInstance(this.f46204a).cancelRequest(this.f46213y, true);
                this.f46213y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f46206c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f46208n;
            tL_documentAttributeVideo.f19191w = this.f46207f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z4 = this.d;
            boolean z10 = this.e;
            if (!z4 && !z10) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f46209r;
                if (z10) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z10) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z10) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            }
        }
        this.f46213y = ConnectionsManager.getInstance(this.f46204a).sendRequest(tL_messages_uploadMedia, new gf.a(this, 29));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.v && !this.f46211w && !this.f46212x) {
            this.v = true;
            if (this.f46206c) {
                t4 t4Var = this.f46210s;
                int i12 = this.f46207f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    t4Var.a(i12, i11);
                }
                a(this.f46205b);
            } else if (this.e) {
                Utilities.globalQueue.postRunnable(new s4(this, 0));
            } else if (this.d) {
                a(this.f46205b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f46205b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f46210s.a(i13, i10);
                    }
                } catch (Exception unused) {
                }
                Utilities.globalQueue.postRunnable(new s4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i11 == this.f46204a && !this.f46211w && !this.f46212x) {
            String str = (String) objArr[0];
            if (this.B != null && this.B.equals(str)) {
                if (i10 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.e && !this.E && !TextUtils.isEmpty(this.C)) {
                        this.D = inputFile2;
                        this.E = true;
                        this.B = this.C;
                        FileLoader.getInstance(this.f46204a).uploadFile(this.B, false, true, 16777216);
                    } else if (this.e && this.E) {
                        c(this.D, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i10 == NotificationCenter.fileUploadFailed) {
                    if (this.e && this.E && (inputFile = this.D) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f46212x = true;
                    e();
                    this.f46210s.onError();
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    t4 t4Var = this.f46210s;
                    if (!this.E) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        t4Var.f(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46204a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public u4(int i10, String str, TLRPC.Document document, c3 c3Var) {
        this.f46204a = i10;
        this.f46205b = str;
        this.f46206c = false;
        this.d = true;
        this.e = false;
        this.f46207f = 0;
        this.h = 0;
        this.f46208n = 0;
        this.f46209r = document;
        this.f46210s = c3Var;
    }

    public u4(int i10, String str, TLRPC.Document document, b3 b3Var) {
        this.f46204a = i10;
        this.f46205b = str;
        this.f46206c = false;
        this.d = false;
        this.e = true;
        this.f46207f = 0;
        this.h = 0;
        this.f46208n = 0;
        this.f46209r = document;
        this.f46210s = b3Var;
    }
}
