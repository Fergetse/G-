/* Generated By:JavaCC: Do not edit this line. GTokenManager.java */
import java.util.HashMap;
import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/** Token Manager. */
public class GTokenManager implements GConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000L) != 0L)
            return 3;
         if ((active0 & 0xfffffe7f2L) != 0L)
         {
            jjmatchedKind = 36;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0xf40022200L) != 0L)
            return 1;
         if ((active0 & 0xbffdc5f2L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 36;
               jjmatchedPos = 1;
            }
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x1ecc472L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x3be110180L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0x180c452L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 36;
               jjmatchedPos = 3;
            }
            return 1;
         }
         if ((active0 & 0x6c0020L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x80c412L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x1080040L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x80c002L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x410L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0xc000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x800002L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 44:
         return jjStartNfaWithStates_0(0, 12, 3);
      case 46:
         return jjStopAtPos(0, 11);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x3010030L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x500400000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x10800000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40000080L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0xa00000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x100200L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x28000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0xc000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40c0140L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 101:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x380800520L);
      case 102:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x110080L);
      case 111:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x20200002L);
      case 113:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 1);
         break;
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x100c000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x10L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 98:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 1);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 100:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 1);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 1);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 1);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000L);
      case 108:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 1);
         break;
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0xc0000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 113:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 1);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 1);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(2, 33, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x1200000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 1);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x400010L);
      case 118:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000010L);
      case 100:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 1);
         break;
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0xc000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 119:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 87:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 1);
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 6, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0xc000L);
      case 121:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 66:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 68:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x2L);
      case 116:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(5, 4, 1);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 108:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 1);
         break;
      case 116:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(6, 1, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(7, 15, 1);
         break;
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(6, 7);
                  else if (curChar == 44)
                     jjCheckNAdd(3);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 44)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0xffffefffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 44 && kind > 38)
                     kind = 38;
                  break;
               case 5:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 6:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 7:
                  if (curChar == 39 && kind > 39)
                     kind = 39;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAddStates(0, 2);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if (curChar == 46)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  jjAddStates(3, 4);
                  break;
               case 6:
                  jjAddStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 102:
         return jjMoveStringLiteralDfa1_1(0x4L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa2_1(active0, 0x4L);
      default :
         return 2;
   }
}
static private int jjMoveStringLiteralDfa2_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(2, 2);
         break;
      default :
         return 3;
   }
   return 3;
}
static final int[] jjnextStates = {
   9, 10, 11, 3, 4, 6, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\141\163\164\141\162\164", "\141\145\156\144", 
"\163\164\141\162\164", "\145\156\144", "\163\145\164", "\151\146", "\162\145\160\145\141\164", "\56", 
"\54", "\164\157", "\160\162\151\156\164\102\151\156", 
"\160\162\151\156\164\104\145\143", "\141\156\144", "\157\162", "\163\150\157\167", "\163\150\157\167\127", 
"\151\156\164", "\167\157\162\144", "\142\171\164\145", "\144\145\143\151\155\141\154", 
"\141\162\162\141\171", "\141\144\144", "\163\165\142", "\155\165\154", "\144\151\166", 
"\155\157\144", "\145\161", "\156\145\161", "\142\145\161", "\147\145\161", "\142\145", 
"\147\145", null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
   "DentroComentario", 
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1fffffffff1L, 
};
static final long[] jjtoSkip = {
   0x3e0000000006L, 
};
static final long[] jjtoSpecial = {
   0x200000000000L, 
};
static final long[] jjtoMore = {
   0x8L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[13];
static private final int[] jjstateSet = new int[26];
static protected char curChar;
/** Constructor. */
public GTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public GTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedPos == 0 && jjmatchedKind > 45)
         {
            jjmatchedKind = 45;
         }
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 3)
         {
            jjmatchedKind = 3;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
           }
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
