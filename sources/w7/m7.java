package w7;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AtomicFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class m7 {
    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(glGetShaderInfoLog);
    }

    public static int b(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        throw new UnsupportedOperationException("Method not decompiled: w7.m7.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public static boolean c(int i10, AtomicFile atomicFile) {
        DataInputStream dataInputStream;
        boolean z10;
        if (!atomicFile.getBaseFile().isFile()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(atomicFile.openRead());
        } catch (Exception unused) {
        }
        if (dataInputStream.readInt() == 1145524273) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 > 0 && readInt2 <= 16777216) {
                int[] iArr = new int[1];
                GLES20.glGetIntegerv(34814, iArr, 0);
                int i11 = iArr[0];
                int[] iArr2 = new int[i11];
                GLES20.glGetIntegerv(34815, iArr2, 0);
                boolean z11 = false;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (iArr2[i12] == readInt) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 |= z10;
                }
                if (z11) {
                    byte[] bArr = new byte[readInt2];
                    dataInputStream.readFully(bArr);
                    if (dataInputStream.read() == -1) {
                        ByteBuffer order = ByteBuffer.allocateDirect(readInt2).order(ByteOrder.nativeOrder());
                        order.put(bArr).position(0);
                        GLES30.glProgramBinary(i10, readInt, order, readInt2);
                        int glGetError = GLES20.glGetError();
                        GLES20.glGetProgramiv(i10, 35714, iArr, 0);
                        if (glGetError == 0 && iArr[0] != 0) {
                            dataInputStream.close();
                            return true;
                        }
                        dataInputStream.close();
                        atomicFile.delete();
                        return false;
                    }
                    throw new IllegalStateException("Invalid binary size");
                }
                throw new IllegalStateException("Unsupported binary format");
            }
            throw new IllegalStateException("Invalid binary length");
        }
        throw new IllegalStateException("Invalid program cache");
    }

    public static void d(int i10, AtomicFile atomicFile) {
        FileOutputStream fileOutputStream = null;
        try {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(i10, 34625, iArr, 0);
            int i11 = iArr[0];
            if (i11 > 0 && i11 <= 16777216) {
                ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                GLES30.glGetProgramBinary(i10, iArr[0], iArr, 0, iArr2, 0, order);
                int i12 = iArr[0];
                if (i12 > 0) {
                    byte[] bArr = new byte[i12];
                    order.position(0);
                    order.get(bArr);
                    fileOutputStream = atomicFile.startWrite();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    dataOutputStream.writeInt(1145524273);
                    dataOutputStream.writeInt(iArr2[0]);
                    dataOutputStream.writeInt(i12);
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    atomicFile.finishWrite(fileOutputStream);
                }
            }
        } catch (Exception unused) {
            if (fileOutputStream != null) {
                atomicFile.failWrite(fileOutputStream);
            }
        }
    }
}
